package xiao.yang.microservice.feignservice;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import xiao.yang.microservice.bean.Dept;

import java.util.List;

@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptFeignService>
{
	@Override
	public DeptFeignService create(Throwable throwable)
	{
		return new DeptFeignService() {



			@Override
			public Dept getDeptById(Integer id) {
				Dept dept = new Dept();
				dept.setName("服务降级");
				return dept;
			}

			@Override
			public List<Dept> getAll() {
				return null;
			}

			@Override
			public int add(Dept dept)
			{
				return 0;
			}
		};
	}
}
