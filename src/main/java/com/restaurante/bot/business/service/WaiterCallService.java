package com.restaurante.bot.business.service;

import com.restaurante.bot.model.WaiterCall;
import com.restaurante.bot.repository.WaiterCallRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WaiterCallService {
    private  final WaiterCallRepository waiterCallRepository;

    public WaiterCallService(WaiterCallRepository waiterCallRepository) {
        this.waiterCallRepository = waiterCallRepository;
    }

    public  List<WaiterCall> ListarWaiterCall() {
        return waiterCallRepository.findAll();
    }

    public WaiterCall guardarWaiterCall(WaiterCall waiterCall) {
        return waiterCallRepository.save(waiterCall);
    }
}
