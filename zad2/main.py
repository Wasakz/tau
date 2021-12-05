from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.edge.service import Service
import time

# Scenariusz 3 Microsoft Edge
# Version 96.0.1054.43 (Official build) (64-bit)

s = Service("msedgedriver.exe")
browser = webdriver.Edge(service=s)
browser.get("http://localhost:8080/")
browser.maximize_window()

time.sleep(2)

browser.find_element(By.NAME, "login").send_keys("test@test.com")
browser.find_element(By.NAME, "password").send_keys("test123")
browser.find_element(By.NAME, "password").send_keys(Keys.RETURN)

time.sleep(2)
browser.find_element(By.CSS_SELECTOR, "input").send_keys("test")
browser.find_element(By.CSS_SELECTOR, "input").send_keys(Keys.RETURN)

time.sleep(2)
tasks = browser.find_elements(By.CLASS_NAME, "mdi-checkbox-blank-circle-outline")
tasks[0].click()

doneTasks = browser.find_elements(By.CLASS_NAME, "mdi-delete-circle")
doneTasks[0].click()



time.sleep(5)
browser.quit()
