<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:a="nju.edu.cn/schema/a">

    <xsl:template match="/">
        <xsl:element name="课程列表">
            <xsl:apply-templates/>
        </xsl:element>
    </xsl:template>

    <xsl:template match="a:课程">
        <xsl:element name="课程">
            <xsl:element name="编号">
                <xsl:value-of select="a:课程编号"/>
            </xsl:element>
            <xsl:element name="名称">
                <xsl:value-of select="a:课程名称"/>
            </xsl:element>
            <xsl:element name="课时">
                未知
            </xsl:element>
            <xsl:element name="学分">
                <xsl:value-of select="a:学分"/>
            </xsl:element>
            <xsl:element name="老师">
                <xsl:value-of select="a:授课老师"/>
            </xsl:element>
            <xsl:element name="地点">
                <xsl:value-of select="a:授课地点"/>
            </xsl:element>
            <xsl:element name="共享">
                <xsl:value-of select="a:共享"/>
            </xsl:element>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>