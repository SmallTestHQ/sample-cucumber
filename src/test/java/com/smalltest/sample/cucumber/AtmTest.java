package com.smalltest.sample.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"junit:target/cucumber-reports/junit.xml"})
public class AtmTest {

}
