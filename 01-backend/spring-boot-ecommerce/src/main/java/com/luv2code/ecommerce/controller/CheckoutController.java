package com.luv2code.ecommerce.controller;

import com.luv2code.ecommerce.dto.Purchase;
import com.luv2code.ecommerce.dto.PurchaseResponse;
import com.luv2code.ecommerce.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
    private  CheckoutService checkoutService;

    @Autowired
   public CheckoutController(CheckoutService checkoutService) {
       this.checkoutService = checkoutService;
   }

   @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

       PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
       return purchaseResponse;
   }
}
