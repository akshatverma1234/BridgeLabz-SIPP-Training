CLASS Customer {
    STRING name
    STRING type  

    METHOD Customer(n, t) {
        name = n
        type = t
    }
}

CLASS CallCenter {
    QUEUE<Customer> normalQueue
    QUEUE<Customer> emergencyQueue

    METHOD addCustomer(customer) {
        IF customer.type == "emergency"
            emergencyQueue.enqueue(customer)
        ELSE
            normalQueue.enqueue(customer)
    }

    METHOD serveCustomer() {
        IF emergencyQueue NOT empty
            served = emergencyQueue.dequeue()
        ELSE
            served = normalQueue.dequeue()
        
        PRINT "Serving: " + served.name
    }
}


cc = CallCenter()
cc.addCustomer(Customer("Akshat", "normal"))
cc.addCustomer(Customer("Aman", "emergency"))
cc.addCustomer(Customer("Aryan", "normal"))

cc.serveCustomer() 
cc.serveCustomer() 

