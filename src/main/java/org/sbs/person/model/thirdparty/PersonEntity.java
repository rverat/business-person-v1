package org.sbs.person.model.thirdparty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.UUID;


/**
 * [Description]. <br/>
 * <b>Class</b>: {@link PersonEntity}<br/>
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
@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize
@Entity
@Table(name = "person")
public class PersonEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    @Pattern(regexp = "[a-zA-Z0-9-]+", message = "invalid")
    @Id
    @Column(name = "id")
    @ApiModelProperty(name = "id", value = "UUID v1",
            dataType = "String", example = "2dc9d304-0808-11ed-861d-0242ac120002", required = true)
    private String id = UUID.randomUUID().toString();
    ;

    @JsonProperty("personId")
    @Pattern(regexp = "[a-zA-Z0-9]+", message = "invalid")
    @Column(name = "personId")
    @ApiModelProperty(name = "personId", value = " person identification code",
            dataType = "String", example = "c73793410", required = true)
    private String personId;

    @JsonProperty("firstName")
    @Pattern(regexp = "[a-zA-Z0-9]+", message = "invalid")
    @Column(name = "firstName")
    @ApiModelProperty(name = "firstName", value = " person name",
            dataType = "String", example = "Maycol", required = true)
    private String firstName;

    @JsonProperty("lastName")
    @Pattern(regexp = "[a-zA-Z0-9]+", message = "invalid")
    @Column(name = "lastName")
    @ApiModelProperty(name = "lastName", value = " person last name",
            dataType = "String", example = "Corvin Collens", required = true)
    private String lastName;

    @JsonProperty("documentType")
    @Size(min = 1, max = 1)
    @Pattern(regexp = "[a-zA-Z0-9]+", message = "invalid")
    @Column(name = "documentType")
    @ApiModelProperty(name = "documentType", value = "Document type of the person",
            dataType = "String", example = "c", required = true)
    private String documentType;

    @JsonProperty("documentNumber")
    @Pattern(regexp = "[a-zA-Z0-9]+", message = "invalid")
    @Column(name = "documentNumber")
    @ApiModelProperty(name = "documentNumber", value = "Document number of the person",
            dataType = "String", example = "73793410", required = true)
    private String documentNumber;

}
