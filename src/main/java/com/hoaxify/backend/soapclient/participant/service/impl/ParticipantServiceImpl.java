package com.hoaxify.backend.soapclient.participant.service.impl;

import com.hoaxify.backend.soapclient.SOAPConnector;
import com.hoaxify.backend.soapclient.participant.ParticipantRepository;
import com.hoaxify.backend.soapclient.participant.model.Bank;
import com.hoaxify.backend.soapclient.participant.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParticipantServiceImpl implements ParticipantService {
    @Autowired
    private SOAPConnector soapClient;

    @Autowired
    private ParticipantRepository repository;

    @Override
    public List<Bank> getAllParticipants() {
        return repository.getAllParticipantInfo()
                .stream()
                .map(all -> all.getBanka())
                .collect(Collectors.toList());
    }
}
