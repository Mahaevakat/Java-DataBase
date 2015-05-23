package com.iasa.ka23.ManagementSystem.db;

import java.util.Comparator;
import java.util.List;

import com.iasa.ka23.ManagementSystem.db.util.ManagementSystemDbException;



@SuppressWarnings("unused")
public interface GenericDao<T> {
	public Integer create(T unit) throws ManagementSystemDbException;   
    public T read(Integer id) throws ManagementSystemDbException;   
    public void update(T unit) throws ManagementSystemDbException;         
    public void delete(T unit) throws ManagementSystemDbException;
    public List<T> getAll() throws ManagementSystemDbException;
    /**
     * This method has paginated return. The order of all records is default
     * @param numberOfPage - number of page (starts from zero)
     * @param recordsPerPage - number of records per one page
     * @return list of records from (numberOfPage * recordsPerPage)
     * @throws ManagementSystemDbException
     */
    public List<T> getDefaultPaginated(int numberOfPage, int recordsPerPage) throws ManagementSystemDbException;
}
