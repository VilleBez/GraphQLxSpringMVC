package idv.villebez.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import idv.villebez.model.GenericID;

public class GenericRepo<ID, T extends GenericID<ID>> {
	protected final Map<ID, T> mockData = new HashMap<ID, T>();
	
	public List<T> getAll() {
		return new ArrayList<T>(mockData.values());
	}

	public T findById(ID id) {
		return mockData.get(id);
	}

	public void save(T obj) {
		obj.setCreateDate(System.currentTimeMillis());
		obj.setUpdateDate(System.currentTimeMillis());
		mockData.put(obj.getId(), obj);
	}

	public void update(ID id, T obj) {
		obj.setUpdateDate(System.currentTimeMillis());
		mockData.put(id, obj);
	}

	public void delete(ID id) {
		mockData.remove(id);
	}
}
