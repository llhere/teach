package test.lambda.lambdaApple;

import java.awt.Color;

import lombok.Data;

@Data
public class Apple {

	/** 编号 */
	private Long id;
	/** 颜色 */
	private Color color;
	/** 重量 */
	private Float weight;
	/** 产地 */
	private String origin;
	
	public Apple() {
		super();
	}

	public Apple(Long id, Color color, Float weight, String origin) {
		super();
		this.id = id;
		this.color = color;
		this.weight = weight;
		this.origin = origin;
	}
	
}
