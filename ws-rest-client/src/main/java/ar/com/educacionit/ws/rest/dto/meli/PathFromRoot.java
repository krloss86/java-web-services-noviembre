
package ar.com.educacionit.ws.rest.dto.meli;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name"
})
public class PathFromRoot {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PathFromRoot) == false) {
            return false;
        }
        PathFromRoot rhs = ((PathFromRoot) other);
        return new EqualsBuilder().append(name, rhs.name).append(id, rhs.id).isEquals();
    }

}
