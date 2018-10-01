package com.example.csv.springbatchcsv.batch;
import com.example.csv.springbatchcsv.model.UserModel;
import org.springframework.stereotype.Component;
import org.springframework.batch.item.ItemProcessor;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<UserModel,UserModel> {
    private static final Map<String,String> DEPT_NAMES=new HashMap<>();
    public Processor()
    {
        DEPT_NAMES.put("001","ANDROID");
        DEPT_NAMES.put("002","IOS");
        DEPT_NAMES.put("003","EAS");
    }
    @Override
    public UserModel process(UserModel userobject) throws Exception
    {
        String code=userobject.getDept();
        String dept=DEPT_NAMES.get(code);
        userobject.setDept(dept);
        userobject.setTime(new Date());
        System.out.println(String.format("Converted from [%s] to [%s]", code, dept));
        return userobject;
    }


}
