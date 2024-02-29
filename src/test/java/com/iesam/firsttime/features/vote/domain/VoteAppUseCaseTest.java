package com.iesam.firsttime.features.vote.domain;


import com.iesam.firsttime.features.vote.data.StubEquals5AppConfigDataRepository;
import com.iesam.firsttime.features.vote.data.StubNot5AppConfigDataRepository;
import com.iesam.firsttime.features.vote.data.StubNullAppConfigDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    public void cuandoObetengoNuloEntoncesNoMuestroElMensajeEsFalse() {
        //Given: se declaran variables.
        VoteAppUseCase voteAppUseCase = new VoteAppUseCase(new StubNullAppConfigDataRepository());

        //When
        boolean voteMessage= voteAppUseCase.execute();


        //Then
        Assertions.assertFalse(voteMessage);
    }

    @Test
    public void cuandoObtengoUnCincoEntoncesMuestroElMensajeEsTrue() {
        //Given: se declaran variables.
        VoteAppUseCase voteAppUseCase = new VoteAppUseCase(new StubEquals5AppConfigDataRepository());


        //When
        boolean voteMessage = voteAppUseCase.execute();


        //Then
        Assertions.assertTrue(voteMessage);
    }


    @Test
    public void cuandoObtengoUnNumeroDistintoDeCincoNoMuestroElMensajeEsFalse() {
        //Given: se declaran variables.
        VoteAppUseCase voteAppUseCase = new VoteAppUseCase(new StubNot5AppConfigDataRepository());


        //When
        boolean voteMessage= voteAppUseCase.execute();


        //Then
        Assertions.assertFalse(voteMessage);
    }
}