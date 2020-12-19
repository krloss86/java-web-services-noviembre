
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
    "name",
    "total_items_in_this_category"
})
public class ChildCategories {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("total_items_in_this_category")
    public Integer totalItemsInThisCategory;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("totalItemsInThisCategory", totalItemsInThisCategory).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(id).append(totalItemsInThisCategory).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChildCategories) == false) {
            return false;
        }
        ChildCategories rhs = ((ChildCategories) other);
        return new EqualsBuilder().append(name, rhs.name).append(id, rhs.id).append(totalItemsInThisCategory, rhs.totalItemsInThisCategory).isEquals();
    }

}
