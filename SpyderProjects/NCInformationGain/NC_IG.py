#Nicholas Cicchetti
import numpy as np
HofX = 0
sunshine = 3/8
rain = 2/8
cloudy = 3/8
cold = 2/8
cool = 2/8
warm = 2/8
hot =  2/8
lowHumitity = 2/8
highHumitity = 6/8
windy= 2/8
still = 4/8
breeze = 2/8
InformationGainForcasts = 0
InformationGainTemps = 0
InfomrationGainHumitities = 0
InfomratoinGainWind = 0
def entropy():
    entropyNum = -((2/4)*np.log2(2/4) + (2/4)*np.log2(2/4)) 
    HofX = entropyNum
    print("Your H(x) is " , HofX)
    return HofX

def InformationGainForcast(sun,rain,cloud,HofX):
    sun = sunshine
    entropySun = -((2/3)*np.log2(2/3) + (1/3)*np.log2(1/3))
    rain = rain
    entropyRain = ((1)*np.log2(1) + (2/2)*np.log2(2/2))
    cloud = cloudy
    entropyCloud = -((2/3)*np.log2(2/3) + (1/3)*np.log2(1/3))
    IG = HofX-(sun*entropySun+rain*entropyRain+cloud*entropyCloud)
    InformationGainForcasts = IG
    print("Your information Gain for Forcast is ",InformationGainForcasts)
    return InformationGainForcasts
    
def InformationGainTemp(cold,cool,warm,hot,HofX):
    cold = cold
    entropyCold = -((1)*np.log2(1) + (2/2)*np.log2(2/2))
    cool = cool
    entropyCool = ((1)*np.log2(1) + (2/2)*np.log2(2/2))
    warm = warm
    entropyWarm = ((1)*np.log2(1) + (2/2)*np.log2(2/2))
    hot = hot
    entropyHot = ((1)*np.log2(1) + (2/2)*np.log2(2/2))
    IG = HofX-(cold*entropyCold+cool*entropyCool+warm*entropyWarm+hot*entropyHot)
    InformationGainTemps = IG
    print("Your information Gain for Temp is ",InformationGainTemps)
    return InformationGainTemps
    
def InformationGainHumitity(high,low,HofX):
    high = highHumitity
    entropyHigh = -((3/6)*np.log2(3/6) + (3/6)*np.log2(3/6))
    low = lowHumitity
    entropyLow = -((1/2)*np.log2(1/2) + (1/2)*np.log2(1/2))
    IG = HofX-(high*entropyHigh+low*entropyLow)
    InformationGainHumitity = IG
    print("Your inforamtion Gain for windy is ",InformationGainHumitity)
    return InformationGainHumitity

def InformationGainWindy(windy,breeze,still,HofX):
    windy = highHumitity
    entropyWindy = -((1)*np.log2(1) + (1)*np.log2(2/2))
    breeze = breeze
    entropyBreeze = -((2/2)*np.log2(2/2) + (1)*np.log2(1))
    still = still
    entorpyStill = -((2/4)*np.log2(2/4) + (2/4)*np.log2(2/4))
    IG = HofX-(windy*entropyWindy+breeze*entropyBreeze+still*entorpyStill)
    InformationGainWind = IG
    print("Your information Gain for windy is ",InformationGainWind)
    return InformationGainWind
    
    

HofX = entropy()
InformationGainForcast(sunshine,rain,cloudy,HofX)
InformationGainTemp(cold,cool,warm,hot,HofX)
InformationGainHumitity(highHumitity,lowHumitity,HofX)
InformationGainWindy(windy,breeze,still,HofX)

    