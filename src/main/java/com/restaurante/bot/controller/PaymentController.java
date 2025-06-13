package com.restaurante.bot.controller;

import com.restaurante.bot.model.Payment;
import com.restaurante.bot.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public List<Payment> ListarPayment() {
        return paymentService.ListarPayment();
    }

    @PostMapping
    public Payment guardarPayment(@RequestBody Payment payment) {
        return paymentService.guardarPayment(payment);
    }
}
