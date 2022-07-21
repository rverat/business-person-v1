package org.sbs.person.business;

import io.reactivex.Maybe;
import org.sbs.person.model.business.PersonResponse;

/**
 * [Description]. <br/>
 * <b>Class</b>: {@link PersonService}<br/>
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
public interface PersonService {

    Maybe<PersonResponse> findByPersonId(String personId);
}
