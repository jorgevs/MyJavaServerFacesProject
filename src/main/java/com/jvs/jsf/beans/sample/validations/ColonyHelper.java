package com.jvs.jsf.beans.sample.validations;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@RequestScoped
public class ColonyHelper {

	public List<ColonyEntity> getColonies() {
		List<ColonyEntity> colonies = new ArrayList<ColonyEntity>();

		ColonyEntity colony = new ColonyEntity(1, "Nápoles", 3810);
		colonies.add(colony);
		colony = new ColonyEntity(2, "Polanco", 11530);
		colonies.add(colony);
		colony = new ColonyEntity(3, "Del Valle Centro", 3100);
		colonies.add(colony);

		return colonies;
	}

	public long getColonyByName(String colonyName) {
		long colonyId = 0;
		List<ColonyEntity> colonies = getColonies();

		for (ColonyEntity colony : colonies) {
			if (colony.getColonyName().equals(colonyName)) {
				colonyId = colony.getColonyId();
				break;
			}
		}
		return colonyId;
	}

	public long getColonyByZip(long zip) {
		long colonyId = 0;
		List<ColonyEntity> colonies = getColonies();

		for (ColonyEntity colony : colonies) {
			if (colony.getColonyZip() == zip) {
				colonyId = colony.getColonyId();
				break;
			}
		}
		return colonyId;
	}

	public List<SelectItem> getSelectItems() {
		List<SelectItem> selectItems = new ArrayList<SelectItem>();
		List<ColonyEntity> colonies = getColonies();

		for (ColonyEntity colony : colonies) {
			SelectItem selectItem = new SelectItem(colony.getColonyId(), colony.getColonyName());
			selectItems.add(selectItem);
		}
		return selectItems;
	}
}
