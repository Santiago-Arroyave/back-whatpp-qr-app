package com.restaurante.bot.controller;

import com.restaurante.bot.model.WaiterCall;
import com.restaurante.bot.business.service.WaiterCallService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/waitercall")
public class WaiterCallController {

    private final WaiterCallService waiterCallService;

    public WaiterCallController(WaiterCallService waiterCallService) {
        this.waiterCallService = waiterCallService;
    }

    @GetMapping
    public List<WaiterCall> listarWaiterCall() {
        return waiterCallService.ListarWaiterCall();
    }

    @PostMapping
    public WaiterCall guardarWaiterCall(@RequestBody WaiterCall waiterCall ) {
        return waiterCallService.guardarWaiterCall(waiterCall);
    }
}
