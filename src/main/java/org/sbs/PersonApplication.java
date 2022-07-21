package org.sbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * [Description]. <br/>
 * <b>Class</b>: {@link PersonApplication}<br/>
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
@SpringBootApplication(scanBasePackages = {"com.sbs"})
@ComponentScan(lazyInit = true)
public class PersonApplication {
    public static void main(String[] args){
        new SpringApplication(PersonApplication.class).run(args);
    }
}
