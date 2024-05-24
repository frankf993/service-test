package com.its.provafinale.services;

import com.its.provafinale.dtos.SegnalazioneDto;
import com.its.provafinale.mapper.SegnalazioneMapper;
import com.its.provafinale.repositories.SegnalazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class SegnalazioneServiceImpl implements SegnalazioneService{
    @Autowired
    private SegnalazioneRepository repo;
    @Autowired
    private SegnalazioneMapper mapper;

    @Override
    public boolean createSegnalazione(SegnalazioneDto segnalazioneDto) {
        segnalazioneDto.setDate(LocalDate.now());
        repo.save(mapper.toEntity(segnalazioneDto));
        return true;
    }

    @Override
    public boolean deleteSegnalazione(long id) {
        repo.deleteById(id);
        return true;
    }

    @Override
    public List<SegnalazioneDto> getFilteredSegnalazioni(String clienteSurname, LocalDate date) {
        List<SegnalazioneDto> list = new ArrayList<>();
        if(clienteSurname != null && date == null){
            list = mapper.toDtoList(repo.findByClienteSurname(clienteSurname));
        }
        else if(clienteSurname == null && date != null) {
            list = mapper.toDtoList(repo.findByDate(date));
        }
        else if(clienteSurname != null && date != null){
            list = mapper.toDtoList(repo.findByDateAndClienteSurname(date, clienteSurname));
        } else{
            list = mapper.toDtoList(repo.findAll());
        }
        return list;
    }
}
