package com.example.designpatterns.chainOfResponsipility.handler

import com.example.designpatterns.chainOfResponsipility.Handler
import com.example.designpatterns.chainOfResponsipility.Request
import com.example.designpatterns.chainOfResponsipility.RequestType

class Director: Handler() {
    override fun handleRequest(request: Request) {
        if(request.requestType == RequestType.PURCHASE && request.cost <2000)
        {
            println("request is approved by the director")

        }
        else this.successor?.handleRequest(request)
    }
}