<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:a="nju.edu.cn/schema/a"
                xmlns:b="nju.edu.cn/schema/b">

    <xsl:template match="/">
        <xsl:element name="b:课程列表" namespace="nju.edu.cn/schema/b">
            <xsl:apply-templates/>
        </xsl:element>
    </xsl:template>

    <xsl:template match="a:课程">
        <xsl:element name="b:课程">
            <xsl:element name="b:编号">
                <xsl:value-of select="a:课程编号"/>
            </xsl:element>
            <xsl:element name="b:名称">
                <xsl:value-of select="a:课程名称"/>
            </xsl:element>
            <xsl:element name="b:课时">
                Null
            </xsl:element>
            <xsl:element name="b:学分">
                <xsl:value-of select="a:学分"/>
            </xsl:element>
            <xsl:element name="b:老师">
                <xsl:value-of select="a:授课老师"/>
            </xsl:element>
            <xsl:element name="b:地点">
                <xsl:value-of select="a:授课地点"/>
            </xsl:element>
            <xsl:element name="b:共享">
                <xsl:value-of select="a:共享"/>
            </xsl:element>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>