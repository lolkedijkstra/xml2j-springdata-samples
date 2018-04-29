# xml2j-springdata-samples
This repository contains some sample applications. The code was generated with the generator (xml2j-gen). 
Generated code relies on the core library (xml2j-springdata-core).

Run the releases:
`$ java -jar release.jar ../input/release.gz ../prop/release.prop`

After running with the provided input the first release in MongoDB looks like this:
```javascript
{
    "_id" : NumberLong(6),
    "m_images" : {
        "m_imageList" : [ 
            {
                "xmlElementName" : "image",
                "atts" : {
                    "width" : "400",
                    "type" : "primary",
                    "uri" : "",
                    "uri150" : "",
                    "height" : "394"
                },
                "content" : ""
            }, 
            {
                "xmlElementName" : "image",
                "atts" : {
                    "width" : "600",
                    "type" : "secondary",
                    "uri" : "",
                    "uri150" : "",
                    "height" : "600"
                },
                "content" : ""
            }, 
            {
                "xmlElementName" : "image",
                "atts" : {
                    "width" : "600",
                    "type" : "secondary",
                    "uri" : "",
                    "uri150" : "",
                    "height" : "600"
                },
                "content" : ""
            }
        ],
        "xmlElementName" : "images",
        "atts" : {},
        "content" : ""
    },
    "m_artists" : {
        "m_artistList" : [ 
            {
                "m_id" : "2",
                "m_name" : "Mr. James Barth & A.D.",
                "m_anv" : "",
                "m_join" : "",
                "m_role" : "",
                "m_tracks" : "",
                "xmlElementName" : "artist",
                "atts" : {},
                "content" : ""
            }
        ],
        "xmlElementName" : "artists",
        "atts" : {},
        "content" : ""
    },
    "m_title" : "Knockin' Boots (Vol 1 Of 2)",
    "m_labels" : {
        "m_labelList" : [ 
            {
                "xmlElementName" : "label",
                "atts" : {
                    "catno" : "SK025",
                    "name" : "Svek",
                    "id" : "5"
                },
                "content" : ""
            }, 
            {
                "xmlElementName" : "label",
                "atts" : {
                    "catno" : "SK 025",
                    "name" : "Svek",
                    "id" : "5"
                },
                "content" : ""
            }
        ],
        "xmlElementName" : "labels",
        "atts" : {},
        "content" : ""
    },
    "m_extraartists" : {
        "m_artistList" : [ 
            {
                "m_id" : "26",
                "m_name" : "Alexi Delano",
                "m_anv" : "A. Delano",
                "m_join" : "",
                "m_role" : "Recorded By, Written-By",
                "m_tracks" : "",
                "xmlElementName" : "artist",
                "atts" : {},
                "content" : ""
            }, 
            {
                "m_id" : "27",
                "m_name" : "Cari Lekebusch",
                "m_anv" : "C. Lekebusch",
                "m_join" : "",
                "m_role" : "Recorded By, Written-By",
                "m_tracks" : "",
                "xmlElementName" : "artist",
                "atts" : {},
                "content" : ""
            }
        ],
        "xmlElementName" : "extraartists",
        "atts" : {},
        "content" : ""
    },
    "m_formats" : {
        "m_format" : {
            "m_descriptions" : {
                "m_descriptionList" : [ 
                    "12\"", 
                    "33 ⅓ RPM"
                ],
                "xmlElementName" : "descriptions",
                "atts" : {},
                "content" : ""
            },
            "xmlElementName" : "format",
            "atts" : {
                "qty" : "1",
                "name" : "Vinyl",
                "text" : ""
            },
            "content" : ""
        },
        "xmlElementName" : "formats",
        "atts" : {},
        "content" : ""
    },
    "m_genres" : {
        "m_genreList" : [ 
            "Electronic"
        ],
        "xmlElementName" : "genres",
        "atts" : {},
        "content" : ""
    },
    "m_styles" : {
        "m_styleList" : [ 
            "Techno", 
            "Tech House"
        ],
        "xmlElementName" : "styles",
        "atts" : {},
        "content" : ""
    },
    "m_country" : "Sweden",
    "m_released" : "1998-05-00",
    "m_notes" : "Recorded in NYC, December 1997.\r\n\r\nPrint on vinyl says:\r\nMessage from the Lords of SVEK: \"Bronze, Silver & Gold\"\r\n",
    "m_master_id" : "713737",
    "m_data_quality" : "Needs Vote",
    "m_tracklist" : {
        "m_trackList" : [ 
            {
                "m_position" : "A1",
                "m_title" : "It's All James",
                "m_duration" : "5:29",
                "xmlElementName" : "track",
                "atts" : {},
                "content" : ""
            }, 
            {
                "m_position" : "B1",
                "m_title" : "Above The Skyline",
                "m_duration" : "5:01",
                "xmlElementName" : "track",
                "atts" : {},
                "content" : ""
            }, 
            {
                "m_position" : "B2",
                "m_title" : "Suckin' Neck",
                "m_duration" : "5:04",
                "xmlElementName" : "track",
                "atts" : {},
                "content" : ""
            }
        ],
        "xmlElementName" : "tracklist",
        "atts" : {},
        "content" : ""
    },
    "m_identifiers" : {
        "m_identifierList" : [],
        "xmlElementName" : "identifiers",
        "atts" : {},
        "content" : ""
    },
    "m_videos" : {
        "m_videoList" : [ 
            {
                "m_title" : "Mr James Barth & A.D. - Above The Skyline - Knockin' Boots Vol 1 and 2 (1998)",
                "m_description" : "Mr James Barth & A.D. - Above The Skyline - Knockin' Boots Vol 1 and 2 (1998)",
                "xmlElementName" : "video",
                "atts" : {
                    "duration" : "301",
                    "src" : "https://www.youtube.com/watch?v=PSechqsNemw",
                    "embed" : "true"
                },
                "content" : ""
            }
        ],
        "xmlElementName" : "videos",
        "atts" : {},
        "content" : ""
    },
    "m_companies" : {
        "m_companyList" : [],
        "xmlElementName" : "companies",
        "atts" : {},
        "content" : ""
    },
    "xmlElementName" : "release",
    "atts" : {
        "id" : "6",
        "status" : "Accepted"
    },
    "content" : "",
    "_class" : "com.xml2j.discogs.releases.ReleaseType"
}
```


