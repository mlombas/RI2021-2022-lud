package uo.ri.cws.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import alb.util.assertion.ArgumentChecks;
import uo.ri.cws.domain.base.BaseEntity;

public class SparePart extends BaseEntity{
	// natural attributes
	private String code;
	private String description;
	private double price;

	// accidental attributes
	private Set<Substitution> substitutions = new HashSet<>();
	
	
	SparePart() {}
	
	public SparePart(String code) {
		ArgumentChecks.isNotNull(code);
		ArgumentChecks.isNotEmpty(code);
		
		this.code = code;
	}
	
	
	public SparePart(String code, String description, double price) {
		this(code);
		this.description = description;
		this.price = price;
	}
	
	public String getCode() {
		return code;
	}


	public String getDescription() {
		return description;
	}


	public double getPrice() {
		return price;
	}
	


	public Set<Substitution> getSubstitutions() {
		return new HashSet<>( substitutions );
	}

	Set<Substitution> _getSubstitutions() {
		return substitutions;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SparePart other = (SparePart) obj;
		return Objects.equals(code, other.code);
	}

	@Override
	public String toString() {
		return "SparePart [code=" + code + ", description=" + description
				+ ", price=" + price + "]";
	}
	

}
