package com.example.designpatterns.chainOfResponsipility

abstract class Handler {
     var successor : Handler? = null

     fun setSuccessorHandler(handler : Handler){
        this.successor=handler
    }
    abstract fun handleRequest(request: Request)
}
enum class RequestType{
    PURCHASE,
    CONFERENCE,
    OTHER
}
data class Request(val requestType: RequestType, val cost : Int)