package com.assignment4.crudapp.data;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Chris
 */
@Service
public class DataService {
    @Autowired 
    private DataRepository repo;
    
    public List<Data> getDataList(){
        return repo.findAll();
    }
    
    public Data getData(long id){
        return repo.getReferenceById(id);
    }
    
    public void deleteData(long id){
        repo.deleteById(id);
    }
    
    public void saveData(Data data){
        repo.save(data);
    }
    
    public void updateData(long id, Data data){
        Data newData = new Data(id, data.getFirstName(), data.getLastName());
        repo.save(newData);
    }
}
