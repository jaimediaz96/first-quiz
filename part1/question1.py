################################################################################
#     ____                          __     _                          ___
#    / __ \  __  __  ___    _____  / /_   (_)  ____    ____          <  /
#   / / / / / / / / / _ \  / ___/ / __/  / /  / __ \  / __ \         / / 
#  / /_/ / / /_/ / /  __/ (__  ) / /_   / /  / /_/ / / / / /        / /  
#  \___\_\ \__,_/  \___/ /____/  \__/  /_/   \____/ /_/ /_/        /_/   
#                                                                        
#  Question 1
################################################################################
#
# Instructions:
# The two functions below are used to tell the weather. They have some bugs that
# need to be fixed. The test suite in `question1_test.py` will verify the output.
# Read the test suite to know the values that these functions should return.

CITY_TEMPERATURE_MAP = {
    "Quito": 22,
    "Sao Paulo": 17,
    "San Francisco": 16,
    "New York": 14,
}

CITY_WEATHER_MAP = {
    "Quito": "sunny",
    "Sao Paulo": "cloudy",
    "San Francisco": "windy",
    "New York": "rainy",
}


def get_city_temperature(city):
    try:
        return CITY_TEMPERATURE_MAP[city]
    except KeyError:
        return None


def get_city_weather(city):
    try:
        sky_condition = CITY_WEATHER_MAP[city]
        temperature = get_city_temperature(city)
        return f"{temperature} degrees and {sky_condition}"
    except KeyError:
        return None
