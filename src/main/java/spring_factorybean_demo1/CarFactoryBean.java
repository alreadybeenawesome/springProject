package spring_factorybean_demo1;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by louis.yu on 2016/4/27.
 */

public class CarFactoryBean implements FactoryBean<Car> {



    private String carInfo;
    //接受都好分隔的属性设置信息

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    //instance car bean
    @Override
    public Car getObject() throws Exception {
        Car car =new Car();
        String [] infos =carInfo.split(",");
        car.setBrand(infos[0]);
        car.setColor(infos[1]);
        car.setPrice(Double.parseDouble(infos[2]));
        return car;
    }

    @Override
    public Class<Car> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
