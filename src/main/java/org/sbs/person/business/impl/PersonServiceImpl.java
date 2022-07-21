package org.sbs.person.business.impl;

import io.reactivex.Maybe;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.sbs.person.business.PersonService;
import org.sbs.person.dao.PersonDao;
import org.sbs.person.mapper.PersonMapper;
import org.sbs.person.model.business.PersonResponse;
import org.springframework.stereotype.Service;

/**
 * [Description]. <br/>
 * <b>Class</b>: {@link PersonServiceImpl}<br/>
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
@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    PersonDao personDao;
    PersonMapper personMapper;

    @Override
    public Maybe<PersonResponse> findByPersonId(String personId) {
        return Maybe.just(personDao.findByPersonId(personId))
                .map(personMapper::personResponseMap)
                .doOnComplete(() -> log.info("Request find user by personId"))
                .doOnError(throwable -> log.error("Error get user info by personId"));
    }
}
