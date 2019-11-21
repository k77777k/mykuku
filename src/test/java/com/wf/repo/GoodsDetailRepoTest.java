package com.wf.repo;

import com.wf.SpringBootDataJpaApplicationTests;
import com.wf.pojo.GoodsDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;



class GoodsDetailRepoTest extends SpringBootDataJpaApplicationTests {

    @Autowired
    private GoodsDetailRepo goodsDetailRepo;

    @Test
    public void test(){
        List<GoodsDetail> all = goodsDetailRepo.findAll();
        for (GoodsDetail goodsDetail : all) {
            System.out.println(goodsDetail);
        }
    }

}