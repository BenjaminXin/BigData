# java面向对象编程

## 目录

[TOC]

## 一、类和对象

### 1. 概念

- 对象：现实中客观存在的实体。java语言中的对象，在内存中体现为一块存储空间
- 类：类别、分类，对多个对象共性的抽象描述。java语言中体现为一种引用数据类型

> 类：包含描述特征/属性的成员变量 以及 描述行为的成员方法

- 类和对象的关系：类用于构建对象的模版，对象的数据结构来自类

### 2. 类、对象 和 引用 的定义

类

> 命名规范：每个单词首字母大写

```
class Person {
    类体;
}
```

类体包含两个方面：`成员变量`, `成员方法`

成员变量

> 命名规范：第二个单词起，首字母大写

```
class 类名 {
    数据类型 成员变量名 = 初始值;
}
```

```
class Person {
    String nameString = "Benjamin";
}
```

对象的创建：

- `new 类名();`, 如，`new Person();`

> 也称 类的实例化
> 
> 在内存空间的堆区申请了一块存储区域，用于存放该对象独有的特征信息

引用：

- 概念：使用引用数据类型定义的变量，叫做引用型变量，简称 引用
- 引用变量主要用于记录对象在堆区中的`内存地址信息`，便于下次访问

- 语法格式：

    ```
    类名 引用变量名;
    引用变量名.成员变量名
    ```

    ```
    Person p = new Person();
    p.name = "Benjamin";
    System.out.println(p.name):
    ```

> 类实例化为对象后，需要用引用型变量指向对象在堆区中的位置(地址)

Person 类

- 代码的执行流程 和 内存分析

Point 类

- 特征：横纵坐标(int类型)
- 要求：声明Point类型的引用变量，指向Point类实例化的对象，并输出特征；修改横纵坐标值后，再次输出


### 3. 成员方法

语法规则：

```
class 类名 {
    返回值类型 成员方法名(形参列表) {
        成员方法体;
    }
}
```

```
class Person {

    void showName(name) {
        System.out.println(name);
    }
}
```

> 第二个单词起，首字母大写


格式和`函数`类似

- 成员方法主要用于编写描述该方法功能的语句块
- 成员方法可以实现代码的重用

方法的调用：

```
引用变量名.成员方法名(实参列表);
```

3.1 无参数成员方法

如， 

```
void show() {
    sout("name = " + name);
    sout("age = " + age);
}
```

- 有参数，无返回值 的方法

```
void change(int a, int b) {
    x = a;
    y = b;
}
```

3.2 可变长参数成员方法

- 参数 0 ～ n 个
- 方法的形参列表中，只能有一个可变长参数，且放到参数列表的末位

```
void showArgument(int num, String... args) {
    sout(num + ", " + (i+1) + "= " + args[i]);
}
```

3.3 返回值

```
int[] getPosition() {
    //int[] pos_list = new int[] {x,y};
    int[] pos_list = new int[2]; 
    pos_list[0] = x; 
    pos_list[1] = y;
    return pos_list;
} 

```

3.3 参数传递的注意事项

- 基本数据类型的变量 作为方法的参数传递时，形参数值的改变，不会影响到实参的数值
- 引用数据类型的变量，作为方法的参数传递时，形式参数值的改变，会影响到实参数的值

## 二、方法和封装

### 1. 构造方法

- 构造方法名 和 类名 相同
- 没有返回值类型
- 可以有多个构造方法，如，有参数的构造方法 和 无参数的构造方法，方便调用

```
class 类名 {
    类名（形参列表）{
        构造方法体;
    }
}
```

```
class Person {
    Person() {
        something;
    }
}
```

- `new Person();` 会调用构造放方法; 若没有定义构造方法，则为`默认构造方法 Person() {}`

构造方法的作用：

- 通过构造方法传参数，初始化成员变量

案例：

- 实现Point类的构造方法
- 默认创建x，y值为原点的Point类的实例化对象
- 以及，可以传参创建的Point类的实例化对象 `Point(int i, int j)`



### 2. 重载 Overload

同名成员方法，根据`参数个数、类型、参数顺序的不同`，在调用方法时，编译器自动识别，实现重载

- 只有参数的变量名不同时，无法实现重载
- 只有返回值不同时, 无法实现重载

案例：

- Point类，自定义成员方法，纵坐标减1
- 自定义成员方法，纵坐标减去指定的参数值

### 3. this 关键字

- 在构造方法中的 this，代表当前正在构造的对象, 即实例化后的对象
- 在成员方法中的 this，代表当前正在调用的对象, 
> 正在构造的对象，和正在调用的对象，是同一个实例化对象

- this 代表当前类 类型的引用变量
> this 指向 类

工作原理：

- 类中的成员变量, 在使用时，默认隐含 this 关键字，完整格式为 `this.name`
- this 代表的是当前实例化的对象，所以不同的对象分别调用同一个成员方法时，会有不同的结果

使用方式：

1. 当成员方法中的形参和成员变量同名时，编译器无法识别, 都默认为带有 this 的成员变量

    > `this.name` 和 形参`name` 区分

2. 作为方法的返回值

    ```
    Point getPoint() {
        return this;
    }


    Point point = new Point();
    // 调用成员方法
    Point point2 = point.getPoint();

    // 这样调用之后，point 和 point2 会指向同一个实例化对象
    ```

3. 在构造方法的第一行，可以使用 this 关键字调用构造方法, 

    ```
    // 无参数构造方法
    Boy() {
        // 调用的是有参数的构造方法，传入参数“Benjamin”
        this("Benjamin");
    }

    // 有参数构造方法
    Boy(String name) {
        this.name = name;
    }
    ```

> 注意引用变量的数字可以为空, 但是会导致`空指针异常`

    ```
    Boy b3 = null;
    b3.show();
    ```

案例1: n 的阶乘

- 递推方式
- 递归方式

案例2： 费式数列/斐波那契数列

- 递推方式
- 递归方式

## 三、 封装

- 对成员变量进行封装，包含验证成员变量数值合理性的代码等

    > `private args;`

- 设置`setter` 和 `getter` 成员方法，用于封装的成员变量的赋值和获取

    > `public setter() {};` `public getter() {};`
    > 
    > 还有成员变量赋值时，进行合理值判断

- 没有修饰符的方法，为默认的访问权限，介于`private` 和 `public` 之间

- 将setter 方法的调用，写在构造方法中，用参数将需要赋值的成员变量的值，传递给setter

案例：

- 学生信息录入
- 输入学生人数和每个学生信息（包含，学号、姓名）


## 四、继承 和 static关键字

案例：

- People 类封装，特征：姓名、年龄、国籍
- 访问特征成员变量的方法
- PeopleTest类，使用有参数方式构造两个对象，输出


### 1. static 关键字

概念：修饰成员变量，表示 静态的含义

- 此时，成员变量由 对象层级 提升到 类层级
  
    > 对象层级，每实例化一个对象，就在内存空间中多申请一块独立的成员变量空间
    > 类层级， 所有该类，实例化的对象 的成员变量，共享该类的成员变量的内存空间
- 随着类加载到内存中，即完成了static成员变量在内存中的创建

使用方式：

- 非静态成员方法，既能访问非静态成员变量，也能访问静态成员变量。因为静态成员变量被所有对象共享

- 静态成员方法，不能访问非静态成员变量，因为此时`this`指向的是实例化对象，不是类

- 注意：开发中，只有隶属于类层级，并且被所有对象共享的内容，才可以使用static关键字修饰

构造块 和 静态代码块:

- 构造块：类体中，方法体外 `{构造块}`

- 代码块：大括号内的代码 `static {静态代码块}`

- 执行顺序：先执行静态代码块，再执行构造块，再执行构造方法。 所以可以在构造块中对成员变量进行统一的初始化, 然后在构造方法中对变量进行定制化的初始化

    > 静态代码块 -> 构造块 -> 构造方法

- 构造代码块中，可以编写一些此类所必须的配置代码, 如，数据库连接的代码等 

main方法:

`public static void main(String[] args) {}`

- args 是命令行参数

案例: 

- Singleton 类的封装
- SingletonTest类，main方法中能且只能得到该类的一个对象

> static 关键字，不仅是限制对象内存位置，同时还限制了调用方式
>
> 如，原本是private的变量、方法，无法通过外部代码引用
>
> 在添加static关键字后，其能通过`class_name.arg_name/method_name` 访问到

### 2. 单例设计模式

保证该类的对象有且只有一个

思路：从构造方法入手，限制构造方法；确保只能实例化一个类的对象的引用；

- 私有化构造方法，使用private关键字修饰
- 声明本类类型的引用变量，指向本类类型的对象，并使用 private static 关键字共同修饰，即限制外部访问，又规范构造单一对象

- 提供公有的get() 方法，将对象返回出去，并使用 public static 关键字修饰

```
public class Singleton {

    // 2. 声明本类类型的引用变量，指向本类类型的对象
    // private 切断外部直接访问
    // static 统一对象的内存空间, 规范构造单一对象
    private static Singleton sin = new Singleton();

    // 1. 私有化构造方法，切断外部通过 new 实例化对象的机会
    private Singleton () {}

    // 3. 提供公有的get方法，将对象return出去
    public static Singleton getInstance() {
        return sin;
    }
}
```

饿汉模式：如上面的代码，从类加载到内存开始，就构建了单一对象


懒汉模式：

> 多用于多线程

```
public class Singleton {

    // 2. 声明本类类型的引用变量，指向null, 等待赋值
    // private 切断外部直接访问
    // static 统一对象的内存空间, 规范构造单一对象
    private static Singleton sin = null;

    // 1. 私有化构造方法，切断外部通过 new 实例化对象的机会
    private Singleton () {}

    // 3. 提供公有的get方法，将对象return出去
    public static Singleton getInstance() {
        // 如果对象不存在, 才创建对象
        if (sin == null) {
            sin = new Singleton();
        }
        return sin;
    }
}
```

### 3. 继承

多个类之间有相同的特征和行为时，将相同的内容提取出来组成公共类。 多个类型只需要编写自己独有的特征和行为。

- `extends` 关键字

- `public class Worker extends Person{}`, 表示继承自Person类

作用: 子类

- 提高代码复用性
- 可扩展性
- 维护性

特点1: 

- 子类不能继承父类的`构造方法`和`私有方法`
- 可以继承`私有成员变量`，但是不能直接访问

特点2:

- 无论何种方式构造子类的对象时，都会自动调用父类的无参构造方法
- 用以初始化从父类中继承的成员变量
- 相当于在子类的构造方法中的第一行增加了`super();` 的效果
- 如果是有参构造，引用父类的构造方法，则需要传入参数，如,`super(name, age);`

    > Worker 类中的 有参构造方法，可以写成如下:
    > ```
    > public void Worker (String name, int age, int salary) {
    >   super(name, age);
    >   setSalary(salary);
    >   // setName(name);
    >   // setAge(Age);
    > }
    > ```

特点3:

- 继承必须满足逻辑关系，不能滥用继承
- java只支持单继承，一个子类只能有一个父类；但是可以有多个子类

方法重写：

重写一个和父类中的方法一样的方法，override

在重写的方法上方，添加标注/注解 `@Override`

在重写的方法内，要保留父类的方法的内容时，如：`super.show();`

- 允许重写的方法有其子类类型
- 方法的访问权限不能变小, 可以相同，或者变大, 如，`父类public -> 子类private` 是不允许的 (extends 扩展)
- 不能抛出更大的异常

案例：

- Animal 类的封装，特征：名字 和 毛色；方法：打印输出所有特征的方法
- Dog 类的封装，继承自 Animal 类, 特征：牙齿数量；方法：打印输出所有特征
- DogTest 类，在 main 方法中分别使用无参和有参方式构造Dog类的实例化对象，并调用方法

构造块，静态代码块 考点:

- 父类、子类，都有构造块 和 静态代码块，那么子类实例化对象时，哪个类的构造块和静态代码块先执行？
- 循序：父类静态代码块 -> 子类静态代码块 -> 父类的构造块 和 构造方法 -> 子类的构造块 和 构造方法
- 逻辑：子类加载时，先执行父类；但是由于静态代码块的优先级最高，所有先加载静态代码块，再执行构造块 然后执行构造方法

访问控制符：

- public: 本类、同一个包中的类、子类、其他类 都能访问
- protected: 其他类不能访问
- default: 子类 和 其他类 不能访问
- private： 只能在本类中访问

package 语句:

包

- 避免类名称冲突
- 定义格式：`pakage 包名1.包名2...包名n;`
- 实现项目管理、解决命名冲突问题
- 包名的规范： `域名 + 项目名称信息 + 模块名称信息`

- 导入 `import`

    > 也可以导入 包 中的静态成员

final 关键字:

- final关键字修饰类后，该类不能被继承。防止滥用继承
- 修饰成员方法后，该方法可以被继承，但是不能被重写。防止方法被改写
- 修饰成员变量，该变量必须初始化，且不能被修改。防止成员变量被修改
  
  > 可以在声明变量时显示初始化、可以声明后，在构造体中初始化、可以在声明后，在构造方法中初始化

- 用于定义修饰常量：如，`public static final int MAX_LENGTH = 10;`

## 五、多态

一个事物的多种形态 —— 多态

### 1. 多态的语法格式

`父类类型 引用变量名 = new 子类类型`

如，圆形类 的引用变量，指向 矩形类，并且调用圆形类中的show()方法

```
Shape sr = new Rect() {
    sr.show();
}
```

> 此时，sr 调用的 show() 方法，编译阶段调用的是 Shape类中的方法；运行阶段调用的是子类 Rect类中的方法   

案例：

- Shape类的封装，特征有：横纵坐标，方法：打印输出特征
- Rect类封装, 继承自 Shape类，特征：长度和宽度
- ShapeRecktTest 类，在main方法中，分别创建 Shape类 和 Rect类对象，打印输出特征

多态的特点:

- 指向Rect类实例化对象的 Shape类型的引用变量, 能否直接调用父类和子类的方法？

    > 父类类型的引用指向子类类型的对象时，父类类型的引用不可以直接调用子类独有的方法. 但是可以调用非静态的重写方法
    >
    > 但是，父类类型的引用，可以直接调用父类独有的方法

### 2. 引用数据类型之间的转换

- 自动类型转换

    子类 自动转为 父类

- 强制类型转换

    父类转为子类，需要强制转换，如，`((Rect) sr1).getLenght;`

- 转换的两个类型之间，必须有继承关系，否则报错


### 3. 多态的意义

- 屏蔽了不同子类的差异性，实现通用的代码，在传入不同的子类对象时，有不同的结果

    如，在ShapeTest类中，自定义绘制图形的方法。需求是，该方法，能适用于所有Shape类的子类的图形对象, 此时，需要应用多态的特点

    ```
    public static void draw(Shape s) {
        s.show();
    }
    ```

### 4. 抽象方法和抽象类

抽象方法：

不能具体实现的方法, 没有方法体, 不能被调用

- 使用 `abstract` 关键字修饰

- 格式：`访问权限 abstract 返回值类型 方法名(形参列表)`

抽象类：

不能具体实例化的类，不能创建对象

- 使用 `abstract` 关键字修饰

抽象类和抽象方法的关系：

- 抽象类中，可以有成员变量、构造方法、成员方法
- 抽象类中可以没有抽象方法，也可以有抽象方法
- 拥有抽象方法的类必须是抽象类

抽象类的意义:

提供模版

- 意义不在于创建对象，而在于被继承

    > 继承抽象类后，需要在子类中，重写抽象类中的抽象方法
- 这一特性，对子类具有强制性和规范性，所有的子类都得按照抽象类编写，视为 模版模式

- 使用抽象类的引用，指向其子类类型的对象。即，多态

    > 如，`AbstructTest at = new SubAbstractTest();`

抽象类的应用：

- 银行有 定期账户 和 活期账户。继承自 账户类

    ```
    public class Account {
        private double money;
        
        public double getInterest() {}
    }
    ```

- getInterest() 获取利息的成员方法，由于账户类型不同，有不同的计算方法
- 所以，在账户类中，无法定义其方法体，但是其子类又必须又这个方法
- 因此，需要将此方法定义为抽象方法，将此类，定义为抽象类, 作为子类的模版

笔试考点：

- private 和 abstract 关键字不能同时修饰一个方法，因为private无法被子类访问

- final 和 abstarct 关键字不能同时修饰一个方法，因为final修饰的方法，无法被重写

- static 和 abstract 关键字不能同时修饰一个方法，因为static会将该方法提升为类方法，和 abstract 不能由类方法访问抽象方法 矛盾


### 5. 接口

抽象抽象类，类中所有方法都是抽象方法

- `interface` 接口关键字, `implement`
- 接口内部只能有常量，如，`public static final int CNT = 1;`
- 只能有抽象方法，如，`public abstract void show();`
- 接口继承接口，用`extends`
- 可以增加 默认权限的非抽象方法，如, `public default void show1();`

    > 子类，可以选择是否重写该方法

- 可以增加静态方法，属于接口层级, 如， `public static void test();`

    > 调用，`接口名.test();`

- java 9 中，允许接口内有私有方法
- 不允许`protected` 关键字修饰方法

接口的意义：

如，金属接口、货币接口，都可以作为 黄金类的父类, 但是不支持多父类，所以引入接口的概念

- 弥补不支持多继承的不足

类和接口的关系:

- 类和类之间 `extends`，单继承
- 类和接口 `implements`, 多实现
- 接口和接口 `extends`, 多继承

案例:

- Runner接口，包含一个描述 奔跑行为的抽象方法
- Hunter接口，继承 Runner接口，提供一个描述捕猎行为的抽象方法
- Man类，实现Hunter接口，并重写抽象方法，在main中，使用多态方式测试


## 六、特殊类

### 1. 内部类

一个类定义在另一类的类体中时，这个类叫做内部类(Inner)，外层的类叫做外部类(Outer)

作用：

当一个类仅仅是为了某一个类服务时，可以定义为内部类。

隐藏该类的实现细节，而且可以方便地访问外部类中的私有成员，而不需要提供公有的getter和setter方法

- 普通内部类
- 静态内部类: 使用static关键字修饰的内部类，属于类层级
- 局部内部类: 在方法体内部定义的类
- 匿名内部类: 没有名字的内部类

#### 1.1 普通内部类

语法规则：

```
访问修饰符 class 外部类类名 {

    访问修饰符 class 内部类类名 {

    }
}
```

声明内部类引用的方式：

```
// 1. 先声明外部类的引用, 指向外部类的实例化对象
NormalOuter no = new NormalOuter();

// 2. 声明内部类的引用，指向内部类的实例化对象
NormalOuter.NormalInner ni = no.new NormalInner();
```

普通内部类的使用方式:

如果内部类主要服务于当前的外部类，其他类不应该访问，不应该被其他类实例化，

所以将普通内部类的访问权限，设置为`private`

- 普通内部类，可以定义成员变量、方法，构造方法
- 可以用 final 和 abstract 关键字修饰, private 和 protected 关键字修饰
- 普通内部类需要通过, 外部类对象来创建对象
- 内部类访问外部类中，与本类内部同名的成员变量或方法是，需要使用`this` 关键字

    > 访问普通内部类的成员变量 `this.cnt;`
    > 
    > 访问外部类的成员变量 `NormalOuter.this.cnt;`

#### 1.2 静态内部类

语法格式：

```
访问修饰符 class 外部类类名 {

    访问修饰符 static class 内部类类名 {

    }
}
```

声明静态内部类引用的方式：

由于静态内部类属于类层级，所以可以直接由类访问，不需要创建外部类的对象

```
// 1. 声明静态内部类类型的引用，指向静态内部类的实例化对象
StaticOuter.StaticInner si = new StaticOuter.StatictInner();

// 2. 调用show方法调试
si.show();
```

使用方式：

- 静态内部类，不能访问外部类中的非静态成员
- 静态内部类，可以直接创建对象
- 静态内部类访问外部类中，与内部类同名的成员变量时，需要通过类名访问

    > 访问静态内部类的成员变量 `StaticInner.show();`
    > 
    > 访问外部类的成员变量 `StaticOuter.show();`


#### 1.3 局部内部类

语法格式:

```
访问修饰符 class 外部类类名 {

    访问修饰符 返回值类型 成员方法名 （形参列表）{
        class 内部类类名 {
        
        }
    }
}
```

定义方法：

在外部类的成员方法内编写局部内部类，在此方法内，实例化局部内部类的对象

使用方法：

- 局部内部类，只能在外部类的成员方法中使用
- 局部内部类，可以在方法体内部直接创建对象
- 局部内部类，不能使用访问控制符 和 static 关键字修饰符（因为是局部）
- 可以使用外部方法中的局部变量，但是必须其必须是 final 修饰的变量
  
  > (因为局部变量在方法体内是始终有效的，如果不是final，有可能在方法内的局部内部类中被修改，但是一旦跳出局部内部类，和原本方法体中的局部变量的值会冲突)


#### 1.4 回调模式

如果一个方法的参数是接口类型，则在调用该方法时，需要创建并传递一个 `实现此接口类型` 的对象。

该方法在运行时，会调用到参数对象中所实现的方法

#### 1.5 匿名内部类(重点)

将回调模式中，`实现此接口的类` 定义为匿名内部类

格式：

```
接口/父类类型 引用变量名 = new 接口/父类类型() {

    方法的重写
};
```

java 8 -> lambda 表达式:

```
(参数列表) -> {
    
    方法体
}
```

### 2. 枚举类

枚举类型，如，四季、性别、方向、星期数

取值只有明确的几个固定值，所有值都可以一一列举出来

#### 2.1 定义枚举类的方法：

1. 私有化类的构造方法，限制外部访问

2. 在类中，声明该类类型的引用变量，指向给类的实例化对象, 有积累固定值，就声明几个变量

3. 其他细节：

    + 变量用 `public` 修饰，则无需写getter方法，返回该变量; 若用`private` 修饰，则反之
    + 用`static`修饰，将变量提升为 类层级的变量，直接用 `类名.变量名` 的方式访问
    + 用`final` 修饰，防止变量被修改，此时变量名视为常量，全部大写

如，`public static final Direction UP = new Direction("up");`

> 枚举类是 多例模式？

#### 2.2 枚举类定义的优化：

1. 使用 `enum` 关键字取代 `class` 定义枚举类, 省略`public static final`, 并且简化初始化

```
public enum Direction {
    
    // 枚举类型的引用变量，写在最前面
    UP("up"), DOWN("down"), LEFT("left"), RIGHT("right");

    private final String desc;

    private DirectionEnum(String desc) {
        this.desc = desc;
    }
    
    public String getDesc() {
        return desc;
    }
}
```

自定义类 和 枚举类，在switch 结构的使用:

- 自定义类型，需要根据switch的字符串内容做判断
- 枚举类型，根据枚举类的对象内容做判断

#### 2.3 Enum类的概念和常用方法

所有的枚举类，都继承于 `java.lang.Enum` 类

| 常用方法 | 效果 |
| :-- | :-- |
| static T[] values() | 返回当前枚举类中所有的对象 |
| String toString() | 返回当前枚举类对象的名称 |
| int ordinal() | 获取枚举对象在枚举类中的索引位置 |
| static T valueOf(String str) | 将参数指定的字符串名转为当前枚举类的对象 |
| int compareTo(E o) | 比较两个枚举对象在定义时的顺序 |

> - T, 范型 代表 type，表示枚举类的类型
> - 注意 `static` 修饰的方法，需要用 类去调用
> - E 表示 element
> - compareTo(E o) 返回的是int类型，算法`两个对象下标相减`, 判断先后顺序

枚举类实现接口：

> 因为 enum 修饰后，枚举类已经继承自 Enum类，无法再继承其他类
> 
> 为了实现枚举类也能继承其他类，需要运用接口的方式

1. 先写好一个接口(xxxInterface)，让枚举类实现(implements)

2. 方法一： 在枚举类中重写 接口中的抽象方法。则，枚举类对象调用同一个方法

3. 方法二： 在枚举类中，各个值的匿名类体里分别重写 接口中的抽象方法。则，枚举类对象会调用其枚举值匿名类体中重写的方法

#### 2.4 注解

Annotation, 标注, 是一种引用数据类型

代码的特殊标记，通过这些标记，可以在编译、类加载、运行时，执行指定的处理

语法格式：

```
访问修饰符 @interface 注解名称 {
    注解成员变量；
}
```

- 没有注解成员的注解，叫做 标记注解
- 注解只有成员变量，没有成员方法。形式以“无形参的方法”形式声明，其方法名定义了该成员变量的名字，其返回值定义了该成员变量的类型，如，`public String value();`
- 如果注解中只有一个成员时，建议使用变量名为 `value`，其类型只能是常见类型
- 使用注解时格式：`@MyAnnotation(value = 'hello', value2 = 'world', ...)`
- 或者在定义注解中的变量时，用`default`关键字，设置默认值 `public String value(); default "default value";`

元注解：

注解上的注解, 是一种基本注解

主要有：`@Retention, @Documented, @Targe, @Inherited, @Repeatable`

- @Retention 用于说明注解的生命周期

    + RetentionPolicy.SOURCE 注解只在源码阶段保留，编译是被忽视
    + RetentionPolicy.CLASS 注解只保留到编译时，不会被加载到JVM中。是默认方式
    + RetentionPolicy.RUNTIME 注解保留到程序运行时

- @Documented 用于生成java文档时，将注解也包含进去, 注意 RetentionPolicy 设置为 RUNTIME

- @Target 指定被修饰的注解，能用于哪些元素的修饰. 即，限定使用场合

- @Inherited 一个超类被该注解标记过的注解，进行注解时，如果子类没有被任何注解应用时，则子类就继承超类的注解

- @Repeatable 表示可重复的含义

预制注解：

Java语言自身提供的注解

- @autor
- @version
- @see 参考转向，相关主题
- @since 从哪个版本开始
- @param
- @return 返回值类型是void时，不可以添加此注解
- @exception 对方法可能抛出的异常进行说明
- @Override
- @Deprecated 表示修饰的元（类、方法等）已过时
- @SuppressWarnings 抑制编译器警告






## 七、作业

1. 编程实现以下需求：

    定义一个长度为[16][16]的整型二维数组并输入或指定所有位置的元素值，分别实现二维数组中所有行和所有列中所有元素的累加和并打印。

    再分别实现二维数组中左上角到右下角和右上角到左下角所有元素的累加和并打印。



2. 编程实现控制台版并支持两人对战的五子棋游戏。 

    （1）绘制棋盘 - 写一个成员方法实现 

    （2）提示黑方和白方分别下棋并重新绘制棋盘 - 写一个成员方法实现。 

    （3）每当一方下棋后判断是否获胜 - 写一个成员方法实现。 

    （4）提示： 采用二维数组来模拟并描述棋盘，棋盘如下： 

    ![](https://s0.lgstatic.com/i/image3/M01/08/ED/CgoCgV6lPoeANwWrAADLvd0SGGM133.png)


```
 * 3. 如何判定棋局结果：
 * 3.1 双方棋子 >= 5 子时，开始判定。除了边界位置，每个棋位有8各方向
 * 3.2 从当前落子的一方开始判断，如，黑棋落子后。遍历棋盘(n * n), 找到第一个黑棋后，
 * 3.3 则遍历该棋子的8个方向，若黑棋连续，则计数加一；否，则下一个方向；若越界，则下一个方向
 * 3.4 记录所有被访问过的棋子位置(当前棋子，和与其有联系的棋子), 避免重复判断
 * 3.5 只需要遍历棋盘一遍，时间复杂度 O(n * n)
```



3. 按照要求设计并实现以下实体类和接口。 

    3.1 第一步：设计和实现以下类 

    （1）手机卡类 特征：卡类型、卡号、用户名、密码、账户余额、通话时长(分钟)、上网流量 行为：显示（卡号 + 用户名 + 当前余额） 

    （2）通话套餐类 特征：通话时长、短信条数、每月资费 行为: 显示所有套餐信息     
    （3）上网套餐类 特征：上网流量、每月资费 行为：显示所有套餐信息 

    （4）用户消费信息类 特征：统计通话时长、统计上网流量、每月消费金额 

    3.2 第二步：设计和实现以下枚举类 手机卡的类型总共有 3 种：大卡、小卡、微型卡 

    3.3 第三步：实体类的优化 将通话套餐类和上网套餐类中相同的特征和行为提取出来组成抽象套餐类。 

    3.4 第四步：创建并实现以下接口 

    （1）通话服务接口 抽象方法: 参数1: 通话分钟, 参数2: 手机卡类对象 让通话套餐类实现通话服务接口。 

    （2）上网服务接口 抽象方法: 参数1: 上网流量, 参数2: 手机卡类对象 让上网套餐类实现上网服务接口。

    3.5 第五步：进行代码测试

    编写测试类使用多态格式分别调用上述方法，
    
    方法体中打印一句话进行功能模拟即可。



---------------------------------------------------------------

作业说明：

1、提供编程代码，代码记得要加注释，方便导师能通过浏览代码明白你的程序执行流程；

2、提供程序运行和讲解的视频（程序运行包含：按照作业要求体现程序执行结果；讲解内容包含：题目分析、实现思路、代码讲解。）

3、当前模块学习过程中的笔记，可以以文档、照片、思维导图的形式提供；

4、本次作业的内容，分三个文件夹，code（每个题单独一个文件夹）、运行视频、学习笔记；

5、要求控制台输出提示明确，如：该某一方下棋了，该位置已有棋子，该位置超出棋盘范围，请重新下棋等等