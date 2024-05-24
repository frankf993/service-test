package com.its.provafinale.services;

import com.its.provafinale.dtos.SegnalazioneDto;

import java.time.LocalDate;
import java.util.List;

public interface SegnalazioneService {
    boolean createSegnalazione(SegnalazioneDto segnalazioneDto);
    boolean deleteSegnalazione(long id);
    List<SegnalazioneDto> getFilteredSegnalazioni(String clienteSurname, LocalDate date);
}
