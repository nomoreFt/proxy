package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeDecorator extends Decorator {

    public TimeDecorator(Component component) {
        super(component);
    }

        @Override
        public String operation() {
            log.info("TimeDecorator 실행");
            long startTime = System.currentTimeMillis();
            String result = super.operation();
            long endTime = System.currentTimeMillis();
            log.info("실행 시간 : " + (endTime - startTime));
            return result;
        }
}
