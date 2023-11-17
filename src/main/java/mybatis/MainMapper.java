package mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MainMapper {
  @Select("SELECT #{val}")
  String test1(String val);

  @Select("SELECT #{rec.value}")
  String test2(MainRecord rec);

  @Select("SELECT #{rec.value}")
  String test3(MainRecord rec, String val);
}
