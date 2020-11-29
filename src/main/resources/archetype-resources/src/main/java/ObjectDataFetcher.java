package $package;

import ${package}.domain.DTO;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

import javax.inject.Singleton;

@Singleton
public class ObjectDataFetcher implements DataFetcher<DTO> {
    @Override
    public DTO get(DataFetchingEnvironment dataFetchingEnvironment) {
        return new DTO("${return-value}");
    }
}
