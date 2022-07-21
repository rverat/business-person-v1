package org.sbs.person.dao;

import org.sbs.expose.web.PersonController;
import org.sbs.person.model.thirdparty.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * [Description]. <br/>
 * <b>Class</b>: {@link PersonDao}<br/>
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
@Repository
public interface PersonDao extends JpaRepository<PersonEntity, String> {
    PersonEntity findByPersonId(String personId);

}
