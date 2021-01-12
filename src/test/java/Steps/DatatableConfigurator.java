package Steps;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

import java.util.Locale;
import java.util.Map;

public class DatatableConfigurator implements TypeRegistryConfigurer{

    @Override
    public Locale locale(){
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry){
        TableEntryTransformer<User> transformer = new TableEntryTransformer<User>(){
            @Override
            public User transform(Map<String,String> entry) throws Throwable {
                return new User(entry.get("username"),entry.get("password") );
            }
        };


        DataTableType tableType = new DataTableType(User.class, transformer);

        typeRegistry.defineDataTableType(tableType);

    }

}

