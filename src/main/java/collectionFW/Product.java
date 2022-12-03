package collectionFW;

import java.util.List;

public class Product {
	private String name;
	private String descrtiption;
	private List<String> tags;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescrtiption() {
		return descrtiption;
	}
	public void setDescrtiption(String descrtiption) {
		this.descrtiption = descrtiption;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
	public Product addTagsToOtherProduct(Product product){
		this.tags.addAll(product.getTags());
		return this;
	}
}
