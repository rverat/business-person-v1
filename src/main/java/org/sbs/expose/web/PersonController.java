package org.sbs.expose.web;

import io.reactivex.Maybe;
import io.reactivex.schedulers.Schedulers;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.sbs.person.business.PersonService;
import org.sbs.person.model.business.PersonResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * [Description]. <br/>
 * <b>Class</b>: {@link PersonController}<br/>
 * <b>Copyright</b>: &Copy; 2022 ORG SBS Per&uacute;. <br/>
 * <b>Company</b>: ORG SBS del Per&uacute;. <br/>
 *
 * @author ORG SBS Per&uacute;. (SBS) <br/>
 * <u>Developed by</u>: <br/>
 * <ul>
 * <li>{USERNAME}. (acronym) From (SBS)</li>
 * </ul>
 * <u>Changes</u>:<br/>
 * <ul>
 * <li>jul. 20, 2022 (acronym) Creation class.</li>
 * </ul>
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("person")
@AllArgsConstructor
public class PersonController {

    PersonService personService;

    @ApiOperation(value = "Get person info",
    produces = MediaType.APPLICATION_JSON_VALUE,
    httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 200, message = "The data was obtained correctly"),
            @ApiResponse(code = 400, message = "Incorrect data"),
            @ApiResponse(code = 500, message = "Error in obtaining the information"),
            @ApiResponse(code = 503, message = "The service is not disposable"),
    })
    @GetMapping(value = "/{personId}", produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_OCTET_STREAM_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Maybe<PersonResponse> findByPersonId(@PathVariable("personId") String personId) {
        log.info("Request find user by personId");
        return personService.findByPersonId(personId).subscribeOn(Schedulers.io());
    }
}
