package org.sbs.person.model.business;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * [Description]. <br/>
 * <b>Class</b>: {@link Person}<br/>
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
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Contains the model business of the person")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    @Pattern(regexp = "[a-zA-Z0-9-]+", message = "invalid")
    @ApiModelProperty(name = "id", value = "UUID v1",
            dataType = "String", example = "2dc9d304-0808-11ed-861d-0242ac120002", required = false)
    private String id;

    @JsonProperty("personId")
    @Pattern(regexp = "[a-zA-Z0-9]+", message = "invalid")
    @ApiModelProperty(name = "personId", value = " person identification code",
            dataType = "String", example = "c73793410", required = true)
    private String personId;

    @JsonProperty("firstName")
    @Pattern(regexp = "[a-zA-Z0-9]+", message = "invalid")
    @ApiModelProperty(name = "firstName", value = " person name",
            dataType = "String", example = "Maycol", required = true)
    private String firstName;

    @JsonProperty("lastName")
    @Pattern(regexp = "[a-zA-Z0-9]+", message = "invalid")
    @ApiModelProperty(name = "lastName", value = " person last name",
            dataType = "String", example = "Corvin Collens", required = true)
    private String lastName;

    @JsonProperty("documentType")
    @Size(min = 1, max = 1)
    @Pattern(regexp = "[a-zA-Z0-9]+", message = "invalid")
    @ApiModelProperty(name = "documentType", value = "Document type of the person",
            dataType = "String", example = "c", required = true)
    private String documentType;

    @JsonProperty("documentNumber")
    @Pattern(regexp = "[a-zA-Z0-9]+", message = "invalid")
    @ApiModelProperty(name = "documentNumber", value = "Document number of the person",
            dataType = "String", example = "73793410", required = true)
    private String documentNumber;
}
