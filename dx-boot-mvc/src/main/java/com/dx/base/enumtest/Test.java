package com.dx.base.enumtest;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yaoj
 * @version 1.0
 * @copyright 广州明动软件有限公司 Copyright (c) 2019
 * @since 2019-3-15
 */
@Slf4j
public class Test {

    public static void main(String[] args) {



//        log.info("结果是 :" + StatusEnum.DOWN.getValue());
//        log.info("结果是 :" + StatusEnum.DOWN);
//
//        for (StatusEnum e : StatusEnum.values()) {
//            System.out.println(e);
//        }
//
//        StatusEnum down = StatusEnum.DOWN;
//
//        log.info("结果是：  " + down);
//
//        log.info("结果是：  " + StatusEnum.values());






//        for (Chenmo e : Chenmo.values()) {
//            System.out.println(e);
//        }

        System.out.println(Chenmo.values());

        Chenmo wanger = Chenmo.WANGER;

        switch(wanger){
            case WANGER:
                System.out.println(wanger);
                break;
            case WANGSI:
                System.out.println(wanger);
                break;
        }


    }

}
