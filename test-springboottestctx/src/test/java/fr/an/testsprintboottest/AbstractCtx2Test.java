package fr.an.testsprintboottest;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.an.testsprintboottest_config.Ctx2AppConfiguration;
import fr.an.testsprintboottest_config.CtxParentAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(
		webEnvironment= WebEnvironment.NONE,
		properties= {"testmode=true"}
//		, classes= {Ctx2AppConfiguration.class}
		)
@ActiveProfiles({"profile2"})
@ContextHierarchy({
	@ContextConfiguration(name="parent", classes=CtxParentAppConfiguration.class),
	@ContextConfiguration(name="ctx2", classes=Ctx2AppConfiguration.class)
})
public abstract class AbstractCtx2Test {

}
