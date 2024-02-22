package com.iesam.firsttime.features.vote.domain;


import com.iesam.firsttime.features.vote.data.Stub2AppConfigDataRepository;
import com.iesam.firsttime.features.vote.data.Stub3AppConfigDataRepository;
import com.iesam.firsttime.features.vote.data.StubAppConfigDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoteAppUseCaseTest {


    private VoteAppUseCase voteAppUseCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        voteAppUseCase=null;
    }

    @Test
    public void cuandoObetengoNuloEntoncesNoMuestroElMensaje() {
        //Given: se declaran variables.
        VoteAppUseCase voteAppUseCase = new VoteAppUseCase(new StubAppConfigDataRepository());

        //When
        boolean voteMessage= voteAppUseCase.execute();


        //Then
        Assertions.assertFalse(voteMessage);
    }

    @Test
    public void cuandoObtengoUnCincoEntoncesMuestroElMensaje() {
        //Given: se declaran variables.
        VoteAppUseCase voteAppUseCase = new VoteAppUseCase(new Stub2AppConfigDataRepository());


        //When
        boolean voteMessage = voteAppUseCase.execute();


        //Then
        Assertions.assertTrue(voteMessage);
    }


    @Test
    public void cuandoObtengoUnNumeroDistintoDeCincoNoMuestroElMensaje() {
        //Given: se declaran variables.
        VoteAppUseCase voteAppUseCase = new VoteAppUseCase(new Stub3AppConfigDataRepository());


        //When
        boolean voteMessage= voteAppUseCase.execute();


        //Then
        Assertions.assertFalse(voteMessage);
    }
}