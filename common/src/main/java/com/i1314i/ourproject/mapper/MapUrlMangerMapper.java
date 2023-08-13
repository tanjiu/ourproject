package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.ditu.MapUrlManger;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author 平行时空
 * @created 2018-12-14 20:35
 **/
@Mapper
public interface MapUrlMangerMapper {
    @Select("select * from mapurl_manger")
    List<MapUrlManger> findAll();

    @Insert("insert into mapurl_manger(pid,cname,ename,href,descs) values(#{pid},#{cname},#{ename},#{href},#{desc})")
    void insertMap(MapUrlManger mapUrlManger);


    void updateMap(MapUrlManger mapUrlManger);

    MapUrlManger findById(MapUrlManger mapUrlManger);

    void deleteMap(MapUrlManger mapUrlManger);
}
