package controller;


import io.reactivex.Maybe;
import io.reactivex.observers.TestObserver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.sbs.person.business.PersonService;
import org.sbs.person.business.impl.PersonServiceImpl;
import org.sbs.person.model.business.PersonResponse;

import static org.mockito.ArgumentMatchers.anyString;

@RunWith(MockitoJUnitRunner.Silent.class)
public class PersonControllerTest {

    @InjectMocks
    private PersonServiceImpl currentExchangeControlles;

    @Mock
    private PersonService personService;


    @Test
    public void findByPersonIdTestEmpty(){

        Mockito.when(personService.findByPersonId(anyString()))
                .thenReturn(Maybe.empty());

        TestObserver<PersonResponse> personResponseTestObserver =
                personService.findByPersonId(anyString()).test();

        personResponseTestObserver.awaitTerminalEvent();
        personResponseTestObserver.assertNoErrors();
    }

    private PersonResponse builPersonResponse(){
        return PersonResponse.builder()
                .firstName("RONALDO")
                .lastName("CORVIN CORVIN")
                .documentType("C")
                .documentNumber("73793410")
                .build();
    }
}
