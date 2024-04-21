package com.example.designpatterns

import com.example.designpatterns.chainOfResponsipility.Request
import com.example.designpatterns.chainOfResponsipility.RequestType
import com.example.designpatterns.chainOfResponsipility.handler.CEO
import com.example.designpatterns.chainOfResponsipility.handler.Director
import com.example.designpatterns.chainOfResponsipility.handler.VP

fun main(){
     val ramezHamdi = CEO()
     val ebrahimMar3i = VP()
     val micheal = Director()

    micheal.setSuccessorHandler(ebrahimMar3i)
    ebrahimMar3i.setSuccessorHandler(ramezHamdi)

    val purchaseRequest = Request(RequestType.PURCHASE, 10_000)
    val conferenceRequest = Request(RequestType.PURCHASE, 500 )

     micheal.handleRequest(conferenceRequest)
     ramezHamdi.handleRequest(conferenceRequest)
}