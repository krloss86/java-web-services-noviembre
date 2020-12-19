
package ar.com.educacionit.ws.rest.dto.meli;

import java.util.List;
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
    "picture",
    "permalink",
    "total_items_in_this_category",
    "path_from_root",
    "children_categories",
    "attribute_types",
    "settings",
    "meta_categ_id",
    "attributable",
    "date_created"
})
public class CategoriaDetalle {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("picture")
    public String picture;
    @JsonProperty("permalink")
    public String permalink;
    @JsonProperty("total_items_in_this_category")
    public Integer totalItemsInThisCategory;
    @JsonProperty("path_from_root")
    public List<PathFromRoot> pathFromRoot = null;
    @JsonProperty("children_categories")
    public List<ChildCategories> childrenCategories = null;
    @JsonProperty("attribute_types")
    public String attributeTypes;
    @JsonProperty("settings")
    public Settings settings;
    @JsonProperty("meta_categ_id")
    public Object metaCategId;
    @JsonProperty("attributable")
    public Boolean attributable;
    @JsonProperty("date_created")
    public String dateCreated;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("picture", picture).append("permalink", permalink).append("totalItemsInThisCategory", totalItemsInThisCategory).append("pathFromRoot", pathFromRoot).append("childrenCategories", childrenCategories).append("attributeTypes", attributeTypes).append("settings", settings).append("metaCategId", metaCategId).append("attributable", attributable).append("dateCreated", dateCreated).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(settings).append(attributeTypes).append(attributable).append(metaCategId).append(pathFromRoot).append(picture).append(dateCreated).append(name).append(childrenCategories).append(id).append(permalink).append(totalItemsInThisCategory).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CategoriaDetalle) == false) {
            return false;
        }
        CategoriaDetalle rhs = ((CategoriaDetalle) other);
        return new EqualsBuilder().append(settings, rhs.settings).append(attributeTypes, rhs.attributeTypes).append(attributable, rhs.attributable).append(metaCategId, rhs.metaCategId).append(pathFromRoot, rhs.pathFromRoot).append(picture, rhs.picture).append(dateCreated, rhs.dateCreated).append(name, rhs.name).append(childrenCategories, rhs.childrenCategories).append(id, rhs.id).append(permalink, rhs.permalink).append(totalItemsInThisCategory, rhs.totalItemsInThisCategory).isEquals();
    }

}
