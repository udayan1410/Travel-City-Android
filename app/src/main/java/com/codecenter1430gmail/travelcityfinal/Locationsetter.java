package com.codecenter1430gmail.travelcityfinal;


public class Locationsetter   {

    String coord;

    public String getLoc(String Heading)
    {
        switch(Heading)
        {


            //Pune Places Info
            case "Dagdusheth Temple":
                //coord = "https://goo.gl/maps/foLLiNz52xGUrivT6";
                coord = "http://maps.google.com/maps?&daddr= 18.5164237,73.85612930000002  ";
                break;

            case "LalMahal":
                coord = "http://maps.google.com/maps?&daddr= 18.518736, 73.85659970000006 ";
                break;

            case "Agakhan Palace":
                coord = "http://maps.google.com/maps?&daddr= 18.5524942,73.90145630000006  ";
                break;

            case "Sarasbaug":
                coord = "http://maps.google.com/maps?&daddr= 18.5017567, 73.85241629999996 ";
                break;

            case "Shaniwarwada":
                coord = "http://maps.google.com/maps?&daddr= 18.5193765, 73.8553339 ";
                break;

            case "Sinhgad Fort":
                coord = "http://maps.google.com/maps?&daddr= 18.366304, 73.75587599999994 ";
                break;
            case "Lavasa":
                coord = "http://maps.google.com/maps?&daddr=18.4096943 , 73.50660370000003 ";
                break;

            case "Lonavla":
                coord = "http://maps.google.com/maps?&daddr= 18.7546171, 73.40623419999997 ";
                break;

            case "Blades Of Glory":
                coord = "http://maps.google.com/maps?&daddr= 18.4857218, 73.84341549999999 ";
                break;


            // Pune Food info
            case "Kayani Bakery":
                coord = "http://maps.google.com/maps?&daddr= 18.5145305,73.88000090000003  ";
                break;

            case "Sujata Mastani":
                coord = "http://maps.google.com/maps?&daddr=18.5117807 , 73.85204019999992 ";
                break;

            case "Katakir":
                coord = "http://maps.google.com/maps?&daddr=18.5112898 ,73.83373210000002  ";
                break;

            case "Chitale Bandhu":
                coord = "http://maps.google.com/maps?&daddr=18.51557 , 73.84190260000003 ";
                break;

            case "Vaishali":
                coord = "http://maps.google.com/maps?&daddr=18.5209 ,73.8413  ";
                break;

            case "German Bakery":
                coord = "http://maps.google.com/maps?&daddr=18.5397643 , 73.88735939999992 ";
                break;
            case "Agent Jack":
                coord = "http://maps.google.com/maps?&daddr= 18.5553743, 73.79746469999998 ";
                break;

            case "Miami":
                coord = "http://maps.google.com/maps?&daddr=18.532399 , 73.82969100000003 ";
                break;

            case "Mix 36":
                coord = "http://maps.google.com/maps?&daddr= 18.539773, 73.90604450000001 ";
                break;


            case "Penthouze":
                coord = "http://maps.google.com/maps?&daddr=18.5385355, 73.90712610000003 ";
                break;

            //Pune Shopping Info
            case "Tulshi Baug":
                coord = "http://maps.google.com/maps?&daddr= 18.514255,  73.85550599999999";
                break;

            case "F-Street":
                coord = "http://maps.google.com/maps?&daddr= 18.5159554,73.87926349999998  ";
                break;

            case "FC Road":
                coord = "http://maps.google.com/maps?&daddr= 18.5295201,  73.84351790000005";
                break;

            case "Phoenix Mall":
                coord = "http://maps.google.com/maps?&daddr= 18.598692,73.75733979999995  ";
                break;

            case "Hong Kong Lane":
                coord = "http://maps.google.com/maps?&daddr=18.5158979 , 73.84203090000005";
                break;

            case "Appa Balvant Chowk":
                coord = "http://maps.google.com/maps?&daddr= 18.516655, 73.85468900000001";
                break;

            case "Amanora":
                coord = "http://maps.google.com/maps?&daddr=18.518669 ,73.93505700000003 ";
                break;

            case "Seasons Mall":
                coord = "http://maps.google.com/maps?&daddr=18.5194929 ,73.9315537 ";
                break;

            case "Juna Bazar":
                coord = "http://maps.google.com/maps?&daddr= 18.5268805,73.85991650000005  ";
                break;



            //Pune Hotels info
            case "Conrad":
                coord = "http://maps.google.com/maps?&daddr=18.5350994 , 73.88305249999996 ";
                break;

            case "Royal Orchid":
                coord = "http://maps.google.com/maps?&daddr= 18.5462596, 73.90652169999998 ";
                break;

            case "Novotel":
                coord = "http://maps.google.com/maps?&daddr= 18.5590515, 73.91125599999998 ";
                break;

            case "Westin":
                coord = "http://maps.google.com/maps?&daddr=18.5392208 ,73.90626109999994  ";
                break;

            case "JW Marriott":
                coord = "http://maps.google.com/maps?&daddr= 18.531918, 73.82989900000007 ";
                break;

            case "Hyatt":
                coord = "http://maps.google.com/maps?&daddr=18.5602638 ,73.91214259999992  ";
                break;

            //Pune Transport
            case "Railway Station":
                coord = "http://maps.google.com/maps?&daddr= 18.5284242, 73.87386459999993 ";
                break;

            case "Airport":
                coord = "http://maps.google.com/maps?&daddr= 18.579343,73.90891680000004  ";
                break;


            //Mumbai Places
            case "Marine Drive":
                coord = "http://maps.google.com/maps?&daddr=  18.9432135, 72.8229996  ";
                break;

            case "Bandra-Worli SeaLink":
                coord = "http://maps.google.com/maps?&daddr=  19.0299139,  72.81564579999997 ";
                break;

            case "Gateway of India":
                coord = "http://maps.google.com/maps?&daddr=  18.9219841, 72.83465430000001  ";
                break;

            case "Juhu Beach":
                coord = "http://maps.google.com/maps?&daddr=  19.098821, 72.83207170000003  ";
                break;

            case "Haji Ali Dargah":
                coord = "http://maps.google.com/maps?&daddr=  18.9778192, 72.81048190000001  ";
                break;

            case "Elephanta Caves":
                coord = "http://maps.google.com/maps?&daddr= 18.9633474 , 72.93148640000004  ";
                break;

            case "Science Center":
                coord = "http://maps.google.com/maps?&daddr=  18.9903698,   72.81794549999995";
                break;

            case "Essel World":
                coord = "http://maps.google.com/maps?&daddr= 19.230098 ,  72.80132520000006 ";
                break;

            case "Wax Museum":
                coord = "http://maps.google.com/maps?&daddr=  19.1001, 72.9158  ";
                break;

            case "Siddhivinayak":
                coord = "http://maps.google.com/maps?&daddr= 19.039846 ,  72.86954700000001 ";
                break;

            //Mumbai Food Info
            case "Ashok vadapav":
                coord = "http://maps.google.com/maps?&daddr= 19.0205419 ,  72.8313508";
                break;

            case "Aswad":
                coord = "http://maps.google.com/maps?&daddr=  19.108611,  73.01773300000002 ";
                break;

            case "Punjabi Grill":
                coord = "http://maps.google.com/maps?&daddr=  19.1412996,  72.83365470000001 ";
                break;

            case "Cafe Mondegar":
                coord = "http://maps.google.com/maps?&daddr=18.9240625  , 72.83213750000004  ";
                break;

            case "Estella":
                coord = "http://maps.google.com/maps?&daddr= 19.0907958 ,72.82727190000003   ";
                break;

            case "Pizza by the bay":
                coord = "http://maps.google.com/maps?&daddr= 18.9333904 , 72.82384669999999  ";
                break;

            case "Sanchos":
                coord = "http://maps.google.com/maps?&daddr= 19.0682 ,  72.8317 ";
                break;

            case "Tasting Room":
                coord = "http://maps.google.com/maps?&daddr=  18.9929814, 72.82324349999999  ";
                break;

            case "Aer":
                coord = "http://maps.google.com/maps?&daddr= 18.9942 , 72.8205  ";
                break;


            //Mumbai Shopping Info
            case "Colaba Causeway":
                coord = "http://maps.google.com/maps?&daddr=18.9135634  , 72.82332120000001  ";
                break;

            case "Mangaldas Market":
                coord = "http://maps.google.com/maps?&daddr=  18.948746,  72.83227299999999 ";
                break;

            case "Fashion Street":
                coord = "http://maps.google.com/maps?&daddr= 18.9389419 , 72.83010689999992  ";
                break;

            case "Chorbazar":
                coord = "http://maps.google.com/maps?&daddr=  18.9605412 , 72.82510789999992  ";
                break;

            case "Crawford Market":
                coord = "http://maps.google.com/maps?&daddr= 18.9476906 , 72.83417510000004  ";
                break;

            case "Manish Market":
                coord = "http://maps.google.com/maps?&daddr= 18.9887182 ,  73.11104920000002 ";
                break;

            case "R City Mall":
                coord = "http://maps.google.com/maps?&daddr= 19.1387635 , 72.83133079999993  ";
                break;

            case "Sea Woods Mall":
                coord = "http://maps.google.com/maps?&daddr= 19.0094224, 73.01986540000007  ";
                break;

            case "Inorbit Mall":
                coord = "http://maps.google.com/maps?&daddr= 19.1725209 ,  72.83630370000003 ";
                break;

            case "High Phoenix":
                coord = "http://maps.google.com/maps?&daddr= 18.9940439 , 72.82509010000001  ";
                break;

            case "Vivian Mall":
                coord = "http://maps.google.com/maps?&daddr= 19.2085718 ,  72.97171879999996 ";
                break;


            //Mumbai Hotels Info
            case "Taj":
                coord = "http://maps.google.com/maps?&daddr=18.9217291 , 72.83303090000004  ";
                break;

            case "Oberoi":
                coord = "http://maps.google.com/maps?&daddr=  18.926975, 72.82045160000007  ";
                break;

            case "Trident":
                coord = "http://maps.google.com/maps?&daddr= 19.066942 , 72.86779200000001  ";
                break;

            case "Pride":
                coord = "http://maps.google.com/maps?&daddr= 18.924599 ,  72.82428759999993 ";
                break;

            case "Hyatt ":
                coord = "http://maps.google.com/maps?&daddr= 19.077421 , 72.851313  ";
                break;

            case "Siesta":
                coord = "http://maps.google.com/maps?&daddr= 19.1218 , 72.8480  ";
                break;

            case "Atlas Plaza":
                coord = "http://maps.google.com/maps?&daddr= 19.1215 ,  72.8504 ";
                break;


            //Mumbai Transport Info
            case "Mumbai Airport":
                coord = "http://maps.google.com/maps?&daddr= 19.077421 ,  72.851313 ";
                break;

            case "CST":
                coord = "http://maps.google.com/maps?&daddr= 18.9402888 ,  72.83529329999999 ";
                break;

            case "Mumbai Metro":
                coord = "http://maps.google.com/maps?&daddr= 19.1195974 ,  72.84732659999997 ";
                break;

            case "Churchgate":
                coord = "http://maps.google.com/maps?&daddr= 18.9322453 , 72.82643780000001  ";
                break;

            case "Kalyan":
                coord = "http://maps.google.com/maps?&daddr= 19.2362 , 73.1302  ";
                break;

            case "Thane":
                coord = "http://maps.google.com/maps?&daddr= 19.1864587 , 72.97546839999995  ";
                break;

            //Delhi Places
            case "Akshardham":
                coord = "http://maps.google.com/maps?&daddr= 23.2293105 ,  72.67413110000007 ";
                break;

            case "Banglasahib Gurudwara":
                coord = "http://maps.google.com/maps?&daddr=28.6275895  , 77.20858880000003  ";
                break;

            case "Humayun's Tomb":
                coord = "http://maps.google.com/maps?&daddr= 28.5934514 ,77.25078229999997   ";
                break;

            case "India Gate":
                coord = "http://maps.google.com/maps?&daddr= 28.612912 , 77.2295097  ";
                break;
            case "Jama Masjid":
                coord = "http://maps.google.com/maps?&daddr= 28.6506792 , 77.23344210000005  ";
                break;

            case "Jantar Mantar":
                coord = "http://maps.google.com/maps?&daddr= 28.6240645 , 77.21593389999998  ";
                break;

            case "Lotus Temple":
                coord = "http://maps.google.com/maps?&daddr= 28.553492 , 77.25882639999998  ";
                break;

            case "National Rail Museum":
                coord = "http://maps.google.com/maps?&daddr= 28.585712 , 77.17976920000001  ";
                break;

            case "Science Center ":
                coord = "http://maps.google.com/maps?&daddr= 28.6130 , 77.2454  ";
                break;

            case "Qutubminar":
                coord = "http://maps.google.com/maps?&daddr= 28.513016 , 77.18640000000005  ";
                break;

            case "Rajghat":
                coord = "http://maps.google.com/maps?&daddr= 28.6406214 ,  77.24950020000006 ";
                break;

            case "Rashtrapati Bhavan":
                coord = "http://maps.google.com/maps?&daddr= 28.6141527 , 77.19596219999994  ";
                break;

            case "RedFort":
                coord = "http://maps.google.com/maps?&daddr= 28.6561592 , 77.24102029999995  ";
                break;

            case "Safdarjung's Tomb":
                coord = "http://maps.google.com/maps?&daddr= 28.5893011 ,  77.21056820000001 ";
                break;

            //Delhi Food Info
            case "Beeryani":
                coord = "http://maps.google.com/maps?&daddr= 28.5466883 , 77.19662790000007  ";
                break;

            case "Bishan Swaroop":
                coord = "http://maps.google.com/maps?&daddr= 28.6564433 , 77.23125549999997  ";
                break;

            case "Bukhara":
                coord = "http://maps.google.com/maps?&daddr= 28.6516808 , 77.23277729999995  ";
                break;

            case "Chorbizzare":
                coord = "http://maps.google.com/maps?&daddr=28.6087395  , 77.23017789999994  ";
                break;

            case "Khandani Pakoda":
                coord = "http://maps.google.com/maps?&daddr= 28.569653 ,  77.19378299999994 ";
                break;

            case "Lalababu Chaat":
                coord = "http://maps.google.com/maps?&daddr=28.6505 ,  77.2319 ";
                break;

            case "Lord of drinks":
                coord = "http://maps.google.com/maps?&daddr= 28.631849 , 77.21691340000007  ";
                break;

            case "Paranthe wali gali":
                coord = "http://maps.google.com/maps?&daddr= 28.6560722 , 77.23050579999995  ";
                break;

            case "Punjabi Grill ":
                coord = "http://maps.google.com/maps?&daddr= 28.64233 , 77.10627999999997  ";
                break;

            case "Rose Cafe":
                coord = "http://maps.google.com/maps?&daddr= 28.517792 ,  77.19828810000001 ";
                break;

            case "Salim's Kebab":
                coord = "http://maps.google.com/maps?&daddr= 28.5726334 , 77.23251000000005  ";
                break;

            case "Shree Balaji Chat":
                coord = "http://maps.google.com/maps?&daddr= 28.6563468 , 77.23173959999997  ";
                break;

            case "Summer house":
                coord = "http://maps.google.com/maps?&daddr=28.5522262 , 77.20382919999997  ";
                break;

            case "Thalaivar":
                coord = "http://maps.google.com/maps?&daddr= 28.5508535 ,77.20787259999997   ";
                break;

            case "The big Yellow door":
                coord = "http://maps.google.com/maps?&daddr= 28.587714 ,77.16728450000005  ";
                break;


            //Delhi Shopping Info
            case "Ambience Mall":
                coord = "http://maps.google.com/maps?&daddr= 28.50548 , 77.09452999999996  ";
                break;

            case "Connaught Place":
                coord = "http://maps.google.com/maps?&daddr= 28.6314512 ,  77.21666720000007 ";
                break;

            case "Chandani Chowk":
                coord = "http://maps.google.com/maps?&daddr= 28.6505942 , 77.23032839999996  ";
                break;


            case "Dilihaat":
                coord = "http://maps.google.com/maps?&daddr= 28.5756186 , 77.20967010000004  ";
                break;


            case "DLF Promenade":
                coord = "http://maps.google.com/maps?&daddr= 28.5426165 , 77.15575260000003  ";
                break;


            case "Janpath Market":
                coord = "http://maps.google.com/maps?&daddr= 28.6257373 , 77.21903810000003  ";
                break;


            case "Karol Bagh Market":
                coord = "http://maps.google.com/maps?&daddr= 28.6453092 , 77.18866500000001  ";
                break;


            case "Khan Market":
                coord = "http://maps.google.com/maps?&daddr= 28.6000912 ,  77.22704249999992 ";
                break;


            case "Lajpat nagar Market":
                coord = "http://maps.google.com/maps?&daddr= 28.5694397 ,  77.242704 ";
                break;


            case "Palika Bazar":
                coord = "http://maps.google.com/maps?&daddr=28.6310085  , 77.2186001  ";
                break;


            case "Sarojini Market":
                coord = "http://maps.google.com/maps?&daddr=28.5772672  , 77.19632159999992  ";
                break;


            case "Select City Walk":
                coord = "http://maps.google.com/maps?&daddr= 28.528491 , 77.21910500000001  ";
                break;

            //Delhi Hotels Info
            case "Leroi":
                coord = "http://maps.google.com/maps?&daddr= 28.6442382 , 77.21063760000004  ";
                break;


            case "Toronto":
                coord = "http://maps.google.com/maps?&daddr= 28.6464147 , 77.20895289999999  ";
                break;


            case "ITC Maurya":
                coord = "http://maps.google.com/maps?&daddr= 28.596982 , 77.17371700000001  ";
                break;


            case "JW Marriott ":
                coord = "http://maps.google.com/maps?&daddr= 28.552554 , 77.12123399999996  ";
                break;


            case "The Lodhi":
                coord = "http://maps.google.com/maps?&daddr= 28.5917883 , 77.23877900000002  ";
                break;


            case "Taj Mahal":
                coord = "http://maps.google.com/maps?&daddr=28.6049062 ,77.22346160000006   ";
                break;


            //Delhi Transport Info
            case "Chandni Chowk Metro":
                coord = "http://maps.google.com/maps?&daddr= 28.66045799999999 , 77.22885489999999  ";
                break;


            case "Indira Gandhi Airport":
                coord = "http://maps.google.com/maps?&daddr= 28.5561624 , 77.09995779999997  ";
                break;

            case "New Delhi Station":
                coord = "http://maps.google.com/maps?&daddr= 28.5891405 , 77.30188290000001  ";
                break;

            case "Old Delhi Station":
                coord = "http://maps.google.com/maps?&daddr= 28.6606385 , 77.22714070000006  ";
                break;



            //Chennai Start Here




            case "Arignaranna Zoo":
                coord = "http://maps.google.com/maps?&daddr=  12.8793266, 80.08191160000001  ";
                break;

            case "Birla Planetarium":
                coord = "http://maps.google.com/maps?&daddr= 13.0119334 ,80.24403669999992   ";
                break;

            case "Elliot Beach":
                coord = "http://maps.google.com/maps?&daddr= 12.9988983 , 80.27185559999998  ";
                break;

            case "Fort St George":
                coord = "http://maps.google.com/maps?&daddr= 13.079589 ,80.28745179999999   ";
                break;

            case "Kapaleeswarar Temple":
                coord = "http://maps.google.com/maps?&daddr= 13.033789 ,  80.26883470000007 ";
                break;

            case "Marina Beach":
                coord = "http://maps.google.com/maps?&daddr=  13.0499526, 80.28240260000007  ";
                break;

            case "MGM dizzee world":
                coord = "http://maps.google.com/maps?&daddr= 12.826808 , 80.24058000000002  ";
                break;

            case "National Art Gallery":
                coord = "http://maps.google.com/maps?&daddr=  13.07320332133567, 80.26098083757324  ";
                break;

            case "Santhome Church":
                coord = "http://maps.google.com/maps?&daddr= 13.032829 , 80.27740940000001  ";
                break;

            case "Thousands Light Mosque":
                coord = "http://maps.google.com/maps?&daddr=13.0550804 ,  80.25510009999994 ";
                break;


            // Food
            case "Anna Laxmi":
                coord = "http://maps.google.com/maps?&daddr= 13.124693 ,  80.20221200000003 ";
                break;

            case "Barbeque Nation":
                coord = "http://maps.google.com/maps?&daddr=13.0469296  , 80.23494470000003  ";
                break;

            case "Benjarong":
                coord = "http://maps.google.com/maps?&daddr= 13.0317025 , 80.25180139999998  ";
                break;


            case "Bombay Lassi":
                coord = "http://maps.google.com/maps?&daddr= 13.0657803 , 80.27125180000007  ";
                break;

            case "Dakshin":
                coord = "http://maps.google.com/maps?&daddr=  13.0297253,  80.24982769999997 ";
                break;

            case "Italia at the parkpod":
                coord = "http://maps.google.com/maps?&daddr=  13.0606699,  80.24981600000001 ";
                break;

            case "Madras Pavillion":
                coord = "http://maps.google.com/maps?&daddr= 13.0102357 , 80.21565099999998  ";
                break;

            case "Murugan Idli Shop":
                coord = "http://maps.google.com/maps?&daddr= 13.0453456 ,80.23278019999998   ";
                break;

            case "Panasian":
                coord = "http://maps.google.com/maps?&daddr= 13.0105844 , 80.22070859999997  ";
                break;

            case "Southern Spice":
                coord = "http://maps.google.com/maps?&daddr= 13.05832 ,80.24732799999992   ";
                break;

            case "Thalapakattu Biryani":
                coord = "http://maps.google.com/maps?&daddr= 13.0321122 , 80.22017119999998  ";
                break;

            case "Abirami Mall":
                coord = "http://maps.google.com/maps?&daddr= 13.0863306 ,  80.24763280000002 ";
                break;

            case "Express Avenue":
                coord = "http://maps.google.com/maps?&daddr= 13.0586561 , 80.26408449999997  ";
                break;

            case "Nungam Bakkam":
                coord = "http://maps.google.com/maps?&daddr= 13.0595365 ,80.24247919999993   ";
                break;

            case "Parrys Corner":
                coord = "http://maps.google.com/maps?&daddr= 13.0962392 ,  80.29014589999997 ";
                break;

            case "Phoenix Mall ":
                coord = "http://maps.google.com/maps?&daddr= 12.9923068 ,80.2170314   ";
                break;

            case "Pondi Bazaar":
                coord = "http://maps.google.com/maps?&daddr= 13.0398891 , 80.2368745  ";
                break;

            case "Ritchie Street":
                coord = "http://maps.google.com/maps?&daddr=  13.0693686, 80.270625  ";
                break;

            case "Snow Carpet":
                coord = "http://maps.google.com/maps?&daddr= 13.0316227 ,  80.22411460000001 ";
                break;

            case "Spencer Plaza":
                coord = "http://maps.google.com/maps?&daddr= 13.0615973 , 80.26107419999994  ";
                break;

            case "T Nagar":
                coord = "http://maps.google.com/maps?&daddr= 13.0405026 , 80.2336924  ";
                break;


            //Hotels in Chennai
            case "Belstead":
                coord = "http://maps.google.com/maps?&daddr= 13.062162 , 80.24528899999996  ";
                break;

            case "ITC Grand Chola":
                coord = "http://maps.google.com/maps?&daddr=  13.0105844,  80.22070859999997 ";
                break;

            case "Pandian":
                coord = "http://maps.google.com/maps?&daddr= 13.075635 ,  80.26279399999999 ";
                break;

            case "Park Hyatt":
                coord = "http://maps.google.com/maps?&daddr=  13.010842, 80.22345799999994  ";
                break;

            case "Radison":
                coord = "http://maps.google.com/maps?&daddr= 12.9944534 ,80.18750610000006   ";
                break;

            case "Royal Agency":
                coord = "http://maps.google.com/maps?&daddr= 13.092844 , 80.20429200000001  ";
                break;

            case "Savera":
                coord = "http://maps.google.com/maps?&daddr= 13.0459557 , 80.26111319999995  ";
                break;

            case "Leela Palace":
                coord = "http://maps.google.com/maps?&daddr= 13.0170095 ,80.27387909999993   ";
                break;

            case "Park Chennai":
                coord = "http://maps.google.com/maps?&daddr= 13.0529601 , 80.25000999999997  ";
                break;

            //Transport Chennai

            case "Chennai Airport":
                coord = "http://maps.google.com/maps?&daddr= 12.994112 , 80.1708668  ";
                break;

            case "Central Railway Station":
                coord = "http://maps.google.com/maps?&daddr= 13.08343 , 80.27614799999992  ";
                break;

            case "Egmore":
                coord = "http://maps.google.com/maps?&daddr=13.0732259  , 80.26092089999997  ";
                break;

            case "Chennai Metro":
                coord = "http://maps.google.com/maps?&daddr= 13.068552 , 80.20398939999995  ";
                break;



            //Banglore Starts Here

            case "Banglore Palace":
                coord = "http://maps.google.com/maps?&daddr= 12.9986964 , 77.59202600000003  ";
                break;

            case "Banerghatta Park":
                coord = "http://maps.google.com/maps?&daddr= 12.800285 , 77.57704739999997  ";
                break;

            case "Cubbon Park":
                coord = "http://maps.google.com/maps?&daddr= 12.9763472 ,77.5929284   ";
                break;

            case "Innovative Film City":
                coord = "http://maps.google.com/maps?&daddr= 12.777992 , 77.41507539999998  ";
                break;

            case "Kaiwara Temple":
                coord = "http://maps.google.com/maps?&daddr= 13.3492262 , 77.98822580000001  ";
                break;

            case "Lal Bagh Botanicals":
                coord = "http://maps.google.com/maps?&daddr= 12.9507432 , 77.58477730000004  ";
                break;

            case "Nandi Hills":
                coord = "http://maps.google.com/maps?&daddr= 13.370154 ,  77.68345509999995 ";
                break;

            case "National Gallery of Art":
                coord = "http://maps.google.com/maps?&daddr= 12.989747 ,  77.58815000000004 ";
                break;

            case "Shivsamudra Falls":
                coord = "http://maps.google.com/maps?&daddr= 12.2997484 , 77.1772737  ";
                break;

            case "St. Mary Basilica":
                coord = "http://maps.google.com/maps?&daddr= 12.9844238 ,77.60428000000002   ";
                break;


            case "Tipusultan Fort":
                coord = "http://maps.google.com/maps?&daddr= 12.9593392, 77.57361330000003  ";
                break;


            case "Vidhan Soudha":
                coord = "http://maps.google.com/maps?&daddr= 12.9794621 , 77.59090889999993  ";
                break;

            //Food
            case "Central Tiffin Room":
                coord = "http://maps.google.com/maps?&daddr= 12.9983 ,77.5694   ";
                break;


            case "Dakshin ":
                coord = "http://maps.google.com/maps?&daddr= 12.9508722 ,77.59536060000005   ";
                break;


            case "Karavalli":
                coord = "http://maps.google.com/maps?&daddr= 12.97232 , 77.60862099999997  ";
                break;


            case "Koshy's Bar and Restro":
                coord = "http://maps.google.com/maps?&daddr= 12.9690767 , 77.6004355  ";
                break;


            case "Mavalli Tiffin Rooms":
                coord = "http://maps.google.com/maps?&daddr= 12.9722049 , 77.60092809999992  ";
                break;


            case "Puchkas":
                coord = "http://maps.google.com/maps?&daddr= 12.9566373 ,77.7086769   ";
                break;

            case "Punjab Pleasures":
                coord = "http://maps.google.com/maps?&daddr=  13.0107826, 77.55489599999999  ";
                break;

            case "Shahi Darbar":
                coord = "http://maps.google.com/maps?&daddr= 13.1077456 , 77.57891100000006  ";
                break;

            case "Sri Sairam's Chaat":
                coord = "http://maps.google.com/maps?&daddr= 13.005410926849903 , 77.57315481858518  ";
                break;

            case "VW Puram Food Street":
                coord = "http://maps.google.com/maps?&daddr=  12.951006092928585,  77.57771907909853 ";
                break;

            //Shopping

            case "Basavana Gudi":
                coord = "http://maps.google.com/maps?&daddr= 12.9421166 ,  77.57536089999996 ";
                break;


            case "Brigade Road":
                coord = "http://maps.google.com/maps?&daddr= 12.9713162 , 77.60699079999995  ";
                break;

            case "Chick Pet":
                coord = "http://maps.google.com/maps?&daddr= 12.9709232 , 77.57631390000006  ";
                break;

            case "Commercial Street":
                coord = "http://maps.google.com/maps?&daddr= 12.982189 , 77.60835470000006  ";
                break;

            case "Forum Mall":
                coord = "http://maps.google.com/maps?&daddr= 12.9347841 , 77.61231859999998  ";
                break;

            case "Gandhi Bazar":
                coord = "http://maps.google.com/maps?&daddr= 12.9455888 , 77.57125559999997  ";
                break;

            case "Jaynagar 4th Block":
                coord = "http://maps.google.com/maps?&daddr= 12.9259401 ,  77.58304190000001 ";
                break;

            case "Malleshwar Market":
                coord = "http://maps.google.com/maps?&daddr= 12.9259401 ,  77.58304190000001 ";
                break;

            case "Mantri Square":
                coord = "http://maps.google.com/maps?&daddr= 12.9916302 , 77.57117189999997  ";
                break;

            case "UB City":
                coord = "http://maps.google.com/maps?&daddr= 12.9716313 ,77.59581170000001   ";
                break;

            case "Garud Mall":
                coord = "http://maps.google.com/maps?&daddr= 12.9700713 , 77.60986439999999  ";
                break;

            //Hotels
            case "Golden Residency":
                coord = "http://maps.google.com/maps?&daddr= 12.978064 , 77.57950499999993  ";
                break;

            case "HM Suites":
                coord = "http://maps.google.com/maps?&daddr= 12.9692959 , 77.60097780000001  ";
                break;

            case "ITC Windsor":
                coord = "http://maps.google.com/maps?&daddr= 12.9941169 , 77.58600409999997  ";
                break;

            case "Lalit Ashok":
                coord = "http://maps.google.com/maps?&daddr= 12.9919749 , 77.581773  ";
                break;

            case "LeeLa Palace":
                coord = "http://maps.google.com/maps?&daddr= 12.9607504 , 77.64835930000004  ";
                break;

            case "Mint Propus":
                coord = "http://maps.google.com/maps?&daddr= 12.961534043132119 , 77.60642701918789  ";
                break;

            case "The Oberoi":
                coord = "http://maps.google.com/maps?&daddr= 12.9733044, 77.6180405  ";
                break;

            case "Signature Inn":
                coord = "http://maps.google.com/maps?&daddr= 12.9730769 ,  77.57050060000006 ";
                break;

            case "Treebo Silver Star":
                coord = "http://maps.google.com/maps?&daddr= 12.979153 , 77.57909300000006  ";
                break;

            case "Zuri White Field":
                coord = "http://maps.google.com/maps?&daddr= 12.990047 , 77.72314200000005  ";
                break;

            case "ITC Gardenia":
                coord = "http://maps.google.com/maps?&daddr= 12.966899 , 77.59575199999995  ";
                break;

            //Transport
            case "Banglore Airport":
                coord = "http://maps.google.com/maps?&daddr= 13.148032 , 77.61961399999996  ";
                break;

            case "Banglore Railway Station":
                coord = "http://maps.google.com/maps?&daddr= 13.0227976 , 77.5527343  ";
                break;

            case "Banglore Metro":
                coord = "http://maps.google.com/maps?&daddr=  12.9464443,  77.5799882 ";
                break;

            case "Yeshvantpur":
                coord = "http://maps.google.com/maps?&daddr= 13.0145937 , 77.55140469999992  ";
                break;



            //Kolkata Starts Here
            case "Belur Math":
                coord = "http://maps.google.com/maps?&daddr= 22.6321853 , 88.35589119999997  ";
                break;


            case "Botanical Gardens":
                coord = "http://maps.google.com/maps?&daddr= 22.5586871 , 88.29112069999996  ";
                break;


            case "Fort William":
                coord = "http://maps.google.com/maps?&daddr= 22.5542459 ,88.33587439999997   ";
                break;


            case "Howrah Bridge":
                coord = "http://maps.google.com/maps?&daddr= 22.5851477 , 88.34680530000003  ";
                break;


            case "Indian Museum":
                coord = "http://maps.google.com/maps?&daddr= 22.5578858 , 88.35112679999997  ";
                break;


            case "St. Paul's":
                coord = "http://maps.google.com/maps?&daddr= 22.5442428 , 88.34668179999994  ";
                break;


            case "Victoria Meomrial":
                coord = "http://maps.google.com/maps?&daddr=22.5448082  ,88.34255780000001   ";
                break;

            case "Alipore Zoo":
                coord = "http://maps.google.com/maps?&daddr=22.5369408  ,88.33167839999999 ";
                break;

            case "Birla Planetarium ":
                coord = "http://maps.google.com/maps?&daddr= 22.5593918  ,88.35914389999994";
                break;

            case "Esplanade":
                coord = "http://maps.google.com/maps?&daddr= 22.5455321  ,88.34734750000007";
                break;


            //Food in kolkata

            case "Ganguram Sweets":
                coord = "http://maps.google.com/maps?&daddr= 22.5465964, 88.34824320000007";
                break;


            case "Oh! Calcutta":
                coord = "http://maps.google.com/maps?&daddr= 22.5380544 ,88.35127080000007 ";
                break;


            case "6 Ballygunge Place":
                coord = "http://maps.google.com/maps?&daddr= 22.5382647 ,88.35871040000006  ";
                break;

            case "Bohemian":
                coord = "http://maps.google.com/maps?&daddr=  22.5295239 ,88.36874490000002  ";
                break;

            case "Jiyo Piyo":
                coord = "http://maps.google.com/maps?&daddr=  22.53087,88.35315700000001  ";
                break;

            case "Kew Pie's Kitchen":
                coord = "http://maps.google.com/maps?&daddr=  22.5366408 ,88.35074729999997 ";
                break;

            case "Ganguram":
                coord = "http://maps.google.com/maps?&daddr=  22.5721578,88.35314340000002 ";
                break;

            case "The Bhoj Company":
                coord = "http://maps.google.com/maps?&daddr=  22.5578796, 88.35443659999999 ";
                break;


            //Code for setting shops in kolkata
            case "College Street":
                coord = "http://maps.google.com/maps?&daddr=  22.5731383,88.36239479999995   ";
                break;

            case "Bura Bazar":
                coord = "http://maps.google.com/maps?&daddr= 22.5779549 ,  88.35368169999992 ";
                break;

            case "Phool Bazaar":
                coord = "http://maps.google.com/maps?&daddr= 22.583404226011687 , 88.34920855927737  ";
                break;

            case "Gariahat":
                coord = "http://maps.google.com/maps?&daddr= 22.5170076 , 88.36581899999999  ";
                break;

            case "Hatibagan":
                coord = "http://maps.google.com/maps?&daddr= 22.5947604 ,88.37134760000004   ";
                break;

            case "New Market":
                coord = "http://maps.google.com/maps?&daddr= 22.5600686 , 88.3524678  ";
                break;

            case "South City Mall":
                coord = "http://maps.google.com/maps?&daddr= 22.5015119 ,  88.36172299999998 ";
                break;


            //Code for setting hotels in kolkata
            case "De Sovrani":
                coord = "http://maps.google.com/maps?&daddr= 22.590488 , 88.41149399999995  ";
                break;

            case "Novotel ":
                coord = "http://maps.google.com/maps?&daddr= 22.5797478 ,88.46116329999995   ";
                break;

            case "Park Prime":
                coord = "http://maps.google.com/maps?&daddr= 22.5409857 ,88.35653709999997   ";
                break;

            case "Pipal Tree":
                coord = "http://maps.google.com/maps?&daddr= 22.6221539 , 88.44554900000003  ";
                break;

            case "The Lalit Great Eastern":
                coord = "http://maps.google.com/maps?&daddr= 22.5681736 , 88.34992179999995  ";
                break;


            //Code for setting transport
            case "Kolkata Airport":
                coord = "http://maps.google.com/maps?&daddr=22.6424217  , 88.43912739999996  ";
                break;


            case "Howrah Station":
                coord = "http://maps.google.com/maps?&daddr= 22.5839456 , 88.34340680000003  ";
                break;

            case "Kolkata Metro":
                coord = "http://maps.google.com/maps?&daddr= 22.5168658 , 88.34610699999996  ";
                break;


            //Hyderabad starts here

            //Hyderabad Special Info Places

            case"Charminar":
                coord = "http://maps.google.com/maps?&daddr= 17.3615636 ,78.47466450000002";
                break;

            case"Ramoji Film City":
                coord = "http://maps.google.com/maps?&daddr=17.4435352 ,78.46070570000006 ";
                break;

            case"Hussain Sagar":
                coord = "http://maps.google.com/maps?&daddr=17.4238798, 78.47382149999999 ";
                break;

            case"Salar Jung Museum":
                coord = "http://maps.google.com/maps?&daddr= 17.3713556 , 78.48036490000004";
                break;

            case"Birla Mandir":
                coord = "http://maps.google.com/maps?&daddr=17.4062367 ,78.46906009999998 ";
                break;

            case"Nehru Zoological Park":
                coord = "http://maps.google.com/maps?&daddr= 17.3483047, 78.44251080000004";
                break;

            case"Golconda Fort":
                coord = "http://maps.google.com/maps?&daddr= 17.383309 , 78.4010528";
                break;

            case"Lumbini Park":
                coord = "http://maps.google.com/maps?&daddr=17.4100675 , 78.47320839999998 ";
                break;

            case"Snow World":
                coord = "http://maps.google.com/maps?&daddr= 17.4145708 , 78.48092250000002";
                break;

            case"NTR Garden":
                coord = "http://maps.google.com/maps?&daddr=17.4120259 ,78.47040820000007 ";
                break;

            //Food in hyderabad

            case"Paradise Biryani":
                coord = "http://maps.google.com/maps?&daddr=17.3775517,78.48359959999993 ";
                break;

            case"Chutneys":
                coord = "http://maps.google.com/maps?&daddr=17.42631 ,78.44765800000005 ";
                break;

            case"Jash e Audh":
                coord = "http://maps.google.com/maps?&daddr= 17.4246964 , 78.3789790000000";
                break;

            case"Ohm":
                coord = "http://maps.google.com/maps?&daddr=17.44684 ,78.38376979999998  ";
                break;

            case "Dakshin  ":
                coord="http://maps.google.com/maps?&daddr=17.432706 , 78.45751419999999";
                break;


            case"Minerva Coffee Shop":
                coord = "http://maps.google.com/maps?&daddr=17.4012807 , 78.48542250000003";
                break;

            case"Guffa":
                coord = "http://maps.google.com/maps?&daddr= 17.4048636 , 78.47644420000006";
                break;

            case"Olive Bistro":
                coord = "http://maps.google.com/maps?&daddr= 17.4294683 , 78.39266769999995";
                break;

            case"Sahib Sindh Sultan":
                coord = "http://maps.google.com/maps?&daddr= 17.415139 , 78.44900400000006";
                break;

            case"Begum Bazar":
                coord = "http://maps.google.com/maps?&daddr= 17.374798 ,  78.46631400000001";
                break;

            case"KOTI":
                coord = "http://maps.google.com/maps?&daddr=17.3857581 ,78.47950029999993 ";
                break;

            case"Nampally":
                coord = "http://maps.google.com/maps?&daddr=17.386041 ,78.46659360000001  ";
                break;

            case"Tobacco Bazar":
                coord = "http://maps.google.com/maps?&daddr= 17.3850181 , 78.48661649999997";
                break;

            case"Laad Bazar":
                coord = "http://maps.google.com/maps?&daddr=17.3628791 , 78.47412880000002 ";
                break;

            case"Forum Sujana Mall":
                coord = "http://maps.google.com/maps?&daddr=  17.484273 , 78.38907999999992";
                break;

            case"Hyderabad Central":
                coord = "http://maps.google.com/maps?&daddr=17.426843 , 78.45303799999999 ";
                break;

            case"Perfume Market":
                coord = "http://maps.google.com/maps?&daddr=17.3615636 ,78.47466450000002 ";
                break;

            case"ITC Kakatiya":
                coord = "http://maps.google.com/maps?&daddr= 17.4325559 , 78.45744620000005";
                break;

            case"Trident ":
                coord = "http://maps.google.com/maps?&daddr=17.4497674 , 78.3789891000000 ";
                break;

            case"Westin ":
                coord = "http://maps.google.com/maps?&daddr= 17.4423539 , 78.3817904 ";
                break;

            case"Taj Banjara":
                coord = "http://maps.google.com/maps?&daddr=17.409748 ,78.44875300000001 ";
                break;

            case"Vivanta Taj":
                coord = "http://maps.google.com/maps?&daddr=17.4432666 , 78.4607575";
                break;


            case"Sheraton":
                coord = "http://maps.google.com/maps?&daddr=17.4218254  , 78.33715259999997";
                break;


            case"The Park":
                coord = "http://maps.google.com/maps?&daddr=17.4236764 ,78.4621449 ";
                break;


            case"Secunderabad":
                coord = "http://maps.google.com/maps?&daddr= 17.4347366 , 78.50200169999994";
                break;


            case"Hyderabad Metro":
                coord = "http://maps.google.com/maps?&daddr=17.4038558 ,78.4633255999999 ";
                break;


            case"Rajiv Gandhi Airport":
                coord = "http://maps.google.com/maps?&daddr=17.2402633 ,78.42938509999999 ";
                break;


            case"Hyderabad Railway Station":
                coord = "http://maps.google.com/maps?&daddr=17.3924217,78.46899880000001 ";
                break;



            //Jaipur starts here
            case "Hawa Mahal":
                    coord = "http://maps.google.com/maps?&daddr= 26.9257713, 75.82365809999999";
                break;



            case "Jaigarh Fort":
                coord = "http://maps.google.com/maps?&daddr=26.9239363,75.82674380000003 ";
                break;


            case "Amber Fort":
                coord = "http://maps.google.com/maps?&daddr=26.9850877, 75.84559279999996 ";
                break;


            case "Jal Mahal":
                coord = "http://maps.google.com/maps?&daddr= 26.9854865 , 75.8513454000000";
                break;


            case "Jantar Mantar ":
                coord = "http://maps.google.com/maps?&daddr= 26.9534306, 75.84607460000007";
                break;


            case "Nahargarh Fort":
                coord = "http://maps.google.com/maps?&daddr=26.924762, 75.82456000000002 ";
                break;


            case "Albert Hall Musuem":
                coord = "http://maps.google.com/maps?&daddr=26.9371782,75.81520599999999  ";
                break;


            case "RajMandir":
                coord = "http://maps.google.com/maps?&daddr=26.911676, 75.81946949999997  ";
                break;


            case "City Palace":
                coord = "http://maps.google.com/maps?&daddr=26.9154198, 75.81008270000007 ";
                break;


            case "Monkey Temple":
                coord = "http://maps.google.com/maps?&daddr= 26.9167, 75.8601";
                break;


            case "Sisodiya Garden":
                coord = "http://maps.google.com/maps?&daddr= 26.8992498, 75.85956839999994";
                break;


            case "1135 AD":
                coord = "http://maps.google.com/maps?&daddr=26.986929 , 75.85056629999997 ";
                break;


            case "Suvarna Mahal":
                coord = "http://maps.google.com/maps?&daddr=26.898284,75.80843299999992 ";
                break;


            case "Peacock Rooftop":
                coord = "http://maps.google.com/maps?&daddr=26.916215 ,75.79560300000003 ";
                break;


            case "Laksmi Misthan":
                coord = "http://maps.google.com/maps?&daddr= 26.9195384,75.82562970000004";
                break;

            case "Sanjay's Omlette":
                coord = "http://maps.google.com/maps?&daddr= 26.8898252 , 75.80836120000004";
                break;


            case "Om Revolving Restaurant":
                coord = "http://maps.google.com/maps?&daddr= 26.91845799475574 ,75.79970131960454";
                break;

            case "Dragon House":
                coord = "http://maps.google.com/maps?&daddr= 26.919676 ,75.79476799999998";
                break;

            case "Okra":
                coord = "http://maps.google.com/maps?&daddr=26.8420458 ,75.79605500000002 ";
                break;

            case "Peshwari":
                coord = "http://maps.google.com/maps?&daddr= 26.92027559331217 ,  75.79231988039555";
                break;

            case "World Trade Park":
                coord = "http://maps.google.com/maps?&daddr=26.8538374, 75.80522910000002 ";
                break;

            case "Pink Square Mall":
                coord = "http://maps.google.com/maps?&daddr=26.9031204,75.83676420000006 ";
                break;

            case "Nehru Bazar":
                coord = "http://maps.google.com/maps?&daddr= 26.9180633, 75.82034750000003";
                break;

            case "Kishan Poli Bazar":
                coord = "http://maps.google.com/maps?&daddr= 26.9222272 , 75.81572089999997";
                break;

            case "Johari Bazar":
                coord = "http://maps.google.com/maps?&daddr= 26.921113, 75.82786179999994";
                break;

            case "Tripoli Bazar":
                coord = "http://maps.google.com/maps?&daddr= 26.9230333,75.826281";
                break;

            case "Bapu Bazar":
                coord = "http://maps.google.com/maps?&daddr=26.9164417 , 75.82282959999998 ";
                break;

            case "Mirza Ismael Road":
                coord = "http://maps.google.com/maps?&daddr=  26.9144785,75.82841929999995";
                break;

            case "Sireh Deori Bazar":
                coord = "http://maps.google.com/maps?&daddr=26.9261492 ,75.82745249999994 ";
                break;

            case "ITC RajPutana":
                coord = "http://maps.google.com/maps?&daddr=26.919728, 75.79149860000007 ";
                break;

            case "Lalit":
                coord = "http://maps.google.com/maps?&daddr= 26.8401193 ,75.80739900000003 ";
                break;

            case "Oberoi Raj Vilas":
                coord = "http://maps.google.com/maps?&daddr=26.8759401, 75.88375930000007 ";
                break;

            case "Ramada":
                coord = "http://maps.google.com/maps?&daddr= 26.8957763,75.8289145";
                break;

            case "Ram Baugh Palace":
                coord = "http://maps.google.com/maps?&daddr=26.8996993, 75.81237390000001 ";
                break;

            case "Trident  ":
                coord = "http://maps.google.com/maps?&daddr=26.9573046 , 75.84284509999998 ";
                break;

            case "Holiday Inn":
                coord = "http://maps.google.com/maps?&daddr= 26.902779, 75.79248860000007";
                break;


            case "Radison Blu":
                coord = "http://maps.google.com/maps?&daddr= 26.842566 ,75.79415829999994";
                break;

            case "Jaipur Airport":
                coord = "http://maps.google.com/maps?&daddr= 26.8288959, 75.80575120000003 ";
                break;

            case "Jaipur Railway Station":
                coord = "http://maps.google.com/maps?&daddr= 26.9183309,75.7899923 ";
                break;


            case "Jaipur Metro":
                coord = "http://maps.google.com/maps?&daddr= 26.9018233 ,75.7998953";
                break;


            case "Arambol Beach":
                coord ="http://maps.google.com/maps?&daddr= 15.6846886 ,73.70328359999996";
                break;



            case "Baga Beach":
                coord ="http://maps.google.com/maps?&daddr= 15.5552787 ,73.75173070000005";
                break;


            case "Dudhsagar Waterfalls":
                coord ="http://maps.google.com/maps?&daddr=  15.3144375,74.3143073";
                break;


            case "St. Cajetan Church":
                coord ="http://maps.google.com/maps?&daddr=  15.5799885,73.82260780000001";
                break;


            case "Bom Jesus Church":
                coord ="http://maps.google.com/maps?&daddr=  15.5008938,73.9116272";
                break;


            case "Calangute Beach":
                coord ="http://maps.google.com/maps?&daddr=  15.549441,73.75348570000006";
                break;


            case "Casino Cruise":
                coord ="http://maps.google.com/maps?&daddr= 15.492915195152516 ,73.83265611855472";
                break;


            case "Fort Aguada":
                coord ="http://maps.google.com/maps?&daddr=  15.5075371,73.77002659999994";
                break;


            case "Grand Island":
                coord ="http://maps.google.com/maps?&daddr= 15.3527247 ,73.77793859999997";
                break;


            case "Vagator Beach":
                coord ="http://maps.google.com/maps?&daddr= 15.5988593 ,73.7566114";
                break;


            case "Ciao Bella":
                coord ="http://maps.google.com/maps?&daddr= 15.6039306 ,73.75515150000001";
                break;


            case "Crab":
                coord ="http://maps.google.com/maps?&daddr= 15.0894502 ,73.92441699999995";
                break;


            case "Fish N Feni":
                coord ="http://maps.google.com/maps?&daddr=  15.6293565,73.72626549999995";
                break;


            case "Ambot Tik":
                coord ="http://maps.google.com/maps?&daddr=  15.3037859,73.91429130000006";
                break;


            case "Bebinga":
                coord ="http://maps.google.com/maps?&daddr= 15.4992567 ,73.82868510000003";
                break;


            case "Noronha's Corner":
                coord ="http://maps.google.com/maps?&daddr=  15.5876542,73.76028559999997";
                break;


            case "Peep's Kitchen":
                coord ="http://maps.google.com/maps?&daddr= 15.470187 ,73.82603399999994";
                break;


            case "Anjuna Flea Market":
                coord ="http://maps.google.com/maps?&daddr=  15.572112,73.74211009999999";
                break;


            case "Bombay Bazaar":
                coord ="http://maps.google.com/maps?&daddr=  15.497907,73.82632430000001";
                break;


            case "Calungute Market":
                coord ="http://maps.google.com/maps?&daddr= 15.549441 ,73.75348570000006";
                break;


            case "Mall de Goa":
                coord ="http://maps.google.com/maps?&daddr=  15.5258488,73.82729889999996";
                break;


            case "Mackie's Night Bazar":
                coord ="http://maps.google.com/maps?&daddr= 15.5680635 ,73.76143750000006";
                break;

            case "Mapusa Fish Market":
                coord ="http://maps.google.com/maps?&daddr=  15.588467,73.81328499999995";
                break;

            case "Panjim Market":
                coord ="http://maps.google.com/maps?&daddr= 15.4909301 ,73.82784960000004";
                break;

            case "Silver Sand":
                coord ="http://maps.google.com/maps?&daddr= 15.5207406 ,73.76840719999996";
                break;

            case "Horizon":
                coord ="http://maps.google.com/maps?&daddr=  15.5463354,73.76204310000003";
                break;

            case "Neptune Point Beach":
                coord ="http://maps.google.com/maps?&daddr=  15.01012,74.02468799999997";
                break;

            case "Yo yo Goa":
                coord ="http://maps.google.com/maps?&daddr= 15.5990851 ,73.74221519999992";
                break;

            case "The banyan Soul":
                coord ="http://maps.google.com/maps?&daddr= 15.5730352 ,73.7478552";
                break;

            case "Treebo":
                coord ="http://maps.google.com/maps?&daddr= 15.563062 ,73.76150299999995";
                break;

            case "Bonanza":
                coord ="http://maps.google.com/maps?&daddr= 15.555248 ,73.756708";
                break;

            case "Dabolim Airport":
                coord ="http://maps.google.com/maps?&daddr= 15.382770214947517 ,73.83493505332035";
                break;

            case "Goa Railway Station":
                coord ="http://maps.google.com/maps?&daddr=  15.2671064,73.97086609999997";
                break;

            case "Cherai Beach":
                coord = "http://maps.google.com/maps?&daddr= 10.1415953,76.17828329999998  ";
                break;

            case "Chottanikara temple":
                coord = "http://maps.google.com/maps?&daddr= 9.933124099999999,76.39134939999997  ";
                break;

            case "Santa Cruz Basilica":
                coord = "http://maps.google.com/maps?&daddr= 9.965031,76.24336459999995  ";
                break;

            case "Mattan Cherry Palace":
                coord = "http://maps.google.com/maps?&daddr= 9.958277299999999,76.25935079999999  ";
                break;

            case "Ernakulam Temple":
                coord = "http://maps.google.com/maps?&daddr= 9.9427226,76.31498160000001  ";
                break;

            case "Hill Palace":
                coord = "http://maps.google.com/maps?&daddr= 9.952638600000002,76.36391389999994  ";
                break;

            case "Indo Portuguese Museum":
                coord = "http://maps.google.com/maps?&daddr=  9.9620603,76.24012859999993 ";
                break;

            case "Kerala Kathakali":
                coord = "http://maps.google.com/maps?&daddr= 9.964022600000002,76.24289160000001  ";
                break;

            case "Kodanad Elephant Training Centre":
                coord = "http://maps.google.com/maps?&daddr= 10.1935371,76.52704990000007  ";
                break;

            case "Paradesi Synagogue":
                coord = "http://maps.google.com/maps?&daddr= 9.9574792,76.25937039999997  ";
                break;

            case "Veeranpuzha Beach":
                coord = "http://maps.google.com/maps?&daddr= 10.070282123197225,76.24011842939456 ";
                break;

            case "Arcanova":
                coord = "http://maps.google.com/maps?&daddr= 9.969019699999999,76.24982990000001  ";
                break;

            case "Dal Roti":
                coord = "http://maps.google.com/maps?&daddr= 9.963201,76.23955799999999  ";
                break;

            case "GingerHouse":
                coord = "http://maps.google.com/maps?&daddr= 9.956835,76.26076899999998  ";
                break;

            case "Kashi Art Cafe":
                coord = "http://maps.google.com/maps?&daddr= 9.9668055,9.9668055  ";
                break;

            case "Kethal's Chicken":
                coord = "http://maps.google.com/maps?&daddr= 10.0159609,76.30203449999999  ";
                break;

            case "Malabar Junction":
                coord = "http://maps.google.com/maps?&daddr= 9.9645502,76.23949259999995  ";
                break;

            case "Rahmathullah Hotel":
                coord = "http://maps.google.com/maps?&daddr= 9.9596979,76.25529849999998  ";
                break;

            case "The Rice Boat Vivanta":
                coord = "http://maps.google.com/maps?&daddr= 9.9684894,76.2577417  ";
                break;

            case "Bazar Road":
                coord = "http://maps.google.com/maps?&daddr= 9.963946300000002,76.25624570000002  ";
                break;

            case "Broadway":
                coord = "http://maps.google.com/maps?&daddr= 9.979167,76.27733469999998  ";
                break;

            case "Jew Town":
                coord = "http://maps.google.com/maps?&daddr= 9.956126399999999,76.26006919999998  ";
                break;

            case "Lulu Mall":
                coord = "http://maps.google.com/maps?&daddr= 10.0261205,76.30706510000005  ";
                break;

            case "Marine Drive ":
                coord = "http://maps.google.com/maps?&daddr= 9.9825798,76.27542749999998  ";
                break;

            case "MG road":
                coord = "http://maps.google.com/maps?&daddr= 9.9830046,76.28250720000005  ";
                break;

            case "Oberon Mall":
                coord = "http://maps.google.com/maps?&daddr= 10.0132284,76.31178079999995  ";
                break;

            case "Brunton BoatYard":
                coord = "http://maps.google.com/maps?&daddr= 9.968553,76.24555899999996  ";
                break;

            case "Casino Hotel":
                coord = "http://maps.google.com/maps?&daddr= 9.936388899999999,76.25388889999999  ";
                break;

            case "Hotel Aishwarya":
                coord = "http://maps.google.com/maps?&daddr= 9.9655484,76.29351139999994 ";
                break;

            case "Crowne Plaza":
                coord = "http://maps.google.com/maps?&daddr= 9.944636599999999,76.31451880000009 ";
                break;

            case "Mermaid Hotel":
                coord = "http://maps.google.com/maps?&daddr= 9.9714894,76.32435439999995  ";
                break;

            case "Milenium Continental":
                coord = "http://maps.google.com/maps?&daddr= 9.975871500000002,76.28281190000007  ";
                break;

            case "Ramada Resort":
                coord = "http://maps.google.com/maps?&daddr=9.8885424,76.31663179999998  ";
                break;

            case "Sonneta Residency":
                coord = "http://maps.google.com/maps?&daddr= 9.966637799999999,76.24271959999999  ";
                break;

            case "Vivanta By Taj":
                coord = "http://maps.google.com/maps?&daddr= 9.9689626,76.25828520000005  ";
                break;

            case "Cochin International Airport":
                coord = "http://maps.google.com/maps?&daddr= 9.9697584,76.290888  ";
                break;

            case "Ernakullam Junction":
                coord = "http://maps.google.com/maps?&daddr= 10.1517834,76.39295800000002  ";
                break;




        }
        return coord;
    }

}
