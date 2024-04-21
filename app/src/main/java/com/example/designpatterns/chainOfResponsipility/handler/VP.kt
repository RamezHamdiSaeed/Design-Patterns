package com.example.designpatterns.chainOfResponsipility.handler

import com.example.designpatterns.chainOfResponsipility.Handler
import com.example.designpatterns.chainOfResponsipility.Request
import com.example.designpatterns.chainOfResponsipility.RequestType

class VP:Handler() {
    override fun handleRequest(request: Request) {
        if((request.requestType == RequestType.PURCHASE && request.cost < 5000) || request.requestType == RequestType.CONFERENCE)
        {
            println("request is approved by the VP")

        }
        else this.successor?.handleRequest(request)
    }

}
