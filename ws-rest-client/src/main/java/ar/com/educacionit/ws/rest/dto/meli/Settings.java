
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
    "adult_content",
    "buying_allowed",
    "buying_modes",
    "catalog_domain",
    "coverage_areas",
    "currencies",
    "fragile",
    "immediate_payment",
    "item_conditions",
    "items_reviews_allowed",
    "listing_allowed",
    "max_description_length",
    "max_pictures_per_item",
    "max_pictures_per_item_var",
    "max_sub_title_length",
    "max_title_length",
    "maximum_price",
    "minimum_price",
    "mirror_category",
    "mirror_master_category",
    "mirror_slave_categories",
    "price",
    "reservation_allowed",
    "restrictions",
    "rounded_address",
    "seller_contact",
    "shipping_modes",
    "shipping_options",
    "shipping_profile",
    "show_contact_information",
    "simple_shipping",
    "stock",
    "sub_vertical",
    "subscribable",
    "tags",
    "vertical",
    "vip_subdomain",
    "buyer_protection_programs",
    "status"
})
public class Settings {

    @JsonProperty("adult_content")
    public Boolean adultContent;
    @JsonProperty("buying_allowed")
    public Boolean buyingAllowed;
    @JsonProperty("buying_modes")
    public List<String> buyingModes = null;
    @JsonProperty("catalog_domain")
    public String catalogDomain;
    @JsonProperty("coverage_areas")
    public String coverageAreas;
    @JsonProperty("currencies")
    public List<String> currencies = null;
    @JsonProperty("fragile")
    public Boolean fragile;
    @JsonProperty("immediate_payment")
    public String immediatePayment;
    @JsonProperty("item_conditions")
    public List<String> itemConditions = null;
    @JsonProperty("items_reviews_allowed")
    public Boolean itemsReviewsAllowed;
    @JsonProperty("listing_allowed")
    public Boolean listingAllowed;
    @JsonProperty("max_description_length")
    public Integer maxDescriptionLength;
    @JsonProperty("max_pictures_per_item")
    public Integer maxPicturesPerItem;
    @JsonProperty("max_pictures_per_item_var")
    public Integer maxPicturesPerItemVar;
    @JsonProperty("max_sub_title_length")
    public Integer maxSubTitleLength;
    @JsonProperty("max_title_length")
    public Integer maxTitleLength;
    @JsonProperty("maximum_price")
    public Object maximumPrice;
    @JsonProperty("minimum_price")
    public Integer minimumPrice;
    @JsonProperty("mirror_category")
    public Object mirrorCategory;
    @JsonProperty("mirror_master_category")
    public Object mirrorMasterCategory;
    @JsonProperty("mirror_slave_categories")
    public List<Object> mirrorSlaveCategories = null;
    @JsonProperty("price")
    public String price;
    @JsonProperty("reservation_allowed")
    public String reservationAllowed;
    @JsonProperty("restrictions")
    public List<Object> restrictions = null;
    @JsonProperty("rounded_address")
    public Boolean roundedAddress;
    @JsonProperty("seller_contact")
    public String sellerContact;
    @JsonProperty("shipping_modes")
    public List<String> shippingModes = null;
    @JsonProperty("shipping_options")
    public List<String> shippingOptions = null;
    @JsonProperty("shipping_profile")
    public String shippingProfile;
    @JsonProperty("show_contact_information")
    public Boolean showContactInformation;
    @JsonProperty("simple_shipping")
    public String simpleShipping;
    @JsonProperty("stock")
    public String stock;
    @JsonProperty("sub_vertical")
    public String subVertical;
    @JsonProperty("subscribable")
    public Boolean subscribable;
    @JsonProperty("tags")
    public List<Object> tags = null;
    @JsonProperty("vertical")
    public String vertical;
    @JsonProperty("vip_subdomain")
    public String vipSubdomain;
    @JsonProperty("buyer_protection_programs")
    public List<String> buyerProtectionPrograms = null;
    @JsonProperty("status")
    public String status;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("adultContent", adultContent).append("buyingAllowed", buyingAllowed).append("buyingModes", buyingModes).append("catalogDomain", catalogDomain).append("coverageAreas", coverageAreas).append("currencies", currencies).append("fragile", fragile).append("immediatePayment", immediatePayment).append("itemConditions", itemConditions).append("itemsReviewsAllowed", itemsReviewsAllowed).append("listingAllowed", listingAllowed).append("maxDescriptionLength", maxDescriptionLength).append("maxPicturesPerItem", maxPicturesPerItem).append("maxPicturesPerItemVar", maxPicturesPerItemVar).append("maxSubTitleLength", maxSubTitleLength).append("maxTitleLength", maxTitleLength).append("maximumPrice", maximumPrice).append("minimumPrice", minimumPrice).append("mirrorCategory", mirrorCategory).append("mirrorMasterCategory", mirrorMasterCategory).append("mirrorSlaveCategories", mirrorSlaveCategories).append("price", price).append("reservationAllowed", reservationAllowed).append("restrictions", restrictions).append("roundedAddress", roundedAddress).append("sellerContact", sellerContact).append("shippingModes", shippingModes).append("shippingOptions", shippingOptions).append("shippingProfile", shippingProfile).append("showContactInformation", showContactInformation).append("simpleShipping", simpleShipping).append("stock", stock).append("subVertical", subVertical).append("subscribable", subscribable).append("tags", tags).append("vertical", vertical).append("vipSubdomain", vipSubdomain).append("buyerProtectionPrograms", buyerProtectionPrograms).append("status", status).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subVertical).append(immediatePayment).append(shippingModes).append(maxDescriptionLength).append(buyingModes).append(listingAllowed).append(itemConditions).append(vertical).append(shippingProfile).append(adultContent).append(mirrorCategory).append(buyingAllowed).append(maxPicturesPerItemVar).append(buyerProtectionPrograms).append(catalogDomain).append(price).append(maxTitleLength).append(mirrorSlaveCategories).append(coverageAreas).append(minimumPrice).append(stock).append(itemsReviewsAllowed).append(subscribable).append(shippingOptions).append(simpleShipping).append(reservationAllowed).append(vipSubdomain).append(restrictions).append(mirrorMasterCategory).append(tags).append(showContactInformation).append(maxPicturesPerItem).append(maxSubTitleLength).append(maximumPrice).append(roundedAddress).append(fragile).append(currencies).append(sellerContact).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Settings) == false) {
            return false;
        }
        Settings rhs = ((Settings) other);
        return new EqualsBuilder().append(subVertical, rhs.subVertical).append(immediatePayment, rhs.immediatePayment).append(shippingModes, rhs.shippingModes).append(maxDescriptionLength, rhs.maxDescriptionLength).append(buyingModes, rhs.buyingModes).append(listingAllowed, rhs.listingAllowed).append(itemConditions, rhs.itemConditions).append(vertical, rhs.vertical).append(shippingProfile, rhs.shippingProfile).append(adultContent, rhs.adultContent).append(mirrorCategory, rhs.mirrorCategory).append(buyingAllowed, rhs.buyingAllowed).append(maxPicturesPerItemVar, rhs.maxPicturesPerItemVar).append(buyerProtectionPrograms, rhs.buyerProtectionPrograms).append(catalogDomain, rhs.catalogDomain).append(price, rhs.price).append(maxTitleLength, rhs.maxTitleLength).append(mirrorSlaveCategories, rhs.mirrorSlaveCategories).append(coverageAreas, rhs.coverageAreas).append(minimumPrice, rhs.minimumPrice).append(stock, rhs.stock).append(itemsReviewsAllowed, rhs.itemsReviewsAllowed).append(subscribable, rhs.subscribable).append(shippingOptions, rhs.shippingOptions).append(simpleShipping, rhs.simpleShipping).append(reservationAllowed, rhs.reservationAllowed).append(vipSubdomain, rhs.vipSubdomain).append(restrictions, rhs.restrictions).append(mirrorMasterCategory, rhs.mirrorMasterCategory).append(tags, rhs.tags).append(showContactInformation, rhs.showContactInformation).append(maxPicturesPerItem, rhs.maxPicturesPerItem).append(maxSubTitleLength, rhs.maxSubTitleLength).append(maximumPrice, rhs.maximumPrice).append(roundedAddress, rhs.roundedAddress).append(fragile, rhs.fragile).append(currencies, rhs.currencies).append(sellerContact, rhs.sellerContact).append(status, rhs.status).isEquals();
    }

}
