package com.example.designpatterns.chainOfResponsipility.handler

import com.example.designpatterns.chainOfResponsipility.Handler
import com.example.designpatterns.chainOfResponsipility.Request

class CEO:Handler() {
    override fun handleRequest(request: Request) {
        println("request is approved by the CEO")

    }
}