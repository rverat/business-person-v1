package org.sbs.person.mapper;

import lombok.AllArgsConstructor;
import org.sbs.expose.web.PersonController;
import org.sbs.person.model.business.PersonResponse;
import org.sbs.person.model.thirdparty.PersonEntity;
import org.springframework.stereotype.Component;

/**
 * [Description]. <br/>
 * <b>Class</b>: {@link PersonMapper}<br/>
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
@Component
@AllArgsConstructor
public class PersonMapper {

    public PersonResponse personResponseMap(PersonEntity personDocument){
        return PersonResponse.builder()
                .firstName(personDocument.getFirstName())
                .lastName(personDocument.getLastName())
                .documentType(personDocument.getDocumentType())
                .documentNumber(personDocument.getDocumentNumber())
                .build();
    };
}
