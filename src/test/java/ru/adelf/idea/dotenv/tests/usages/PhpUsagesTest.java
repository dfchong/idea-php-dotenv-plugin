package ru.adelf.idea.dotenv.tests.usages;

import ru.adelf.idea.dotenv.tests.DotEnvLightCodeInsightFixtureTestCase;

public class PhpUsagesTest extends DotEnvLightCodeInsightFixtureTestCase {

    @Override
    public void setUp() throws Exception {
        super.setUp();
        myFixture.configureFromExistingVirtualFile(myFixture.copyFileToProject("usages.php"));
    }

    protected String getTestDataPath() {
        return basePath + "usages/fixtures";
    }

    public void testUsages() {
        assertUsagesContains("PHP_TEST", "PHP_TEST2");
    }
}
